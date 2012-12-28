import java.text.Normalizer
import java.util.regex.Pattern
import scala.util.control.Breaks._
import com.typesafe.config._
import collection.JavaConversions._

/**

*/
object Inflections {
  val config = ConfigFactory.load()

  val uncountable = config.getStringList("inflector.uncountable")
  val plural = (config.getStringList("inflector.plural").sliding(2, 2).toList.map((tuple) => (tuple.get(0), tuple.get(1))) ++ config.getStringList("inflector.irregular").sliding(2, 2).toList.map((tuple) => (tuple.get(1) + "$", tuple.get(0)))).reverse
  val singular = (config.getStringList("inflector.singular").sliding(2, 2).toList.map((tuple) => (tuple.get(0), tuple.get(1))) ++ config.getStringList("inflector.irregular").sliding(2, 2).toList.map((tuple) => (tuple.get(0) + "$", tuple.get(1)))).reverse
  val unicodeMapping = config.getStringList("inflector.unicodeMapping").sliding(2, 2).toList.map((tuple) => (tuple.get(0), tuple.get(1))).reverse

  def camelize(term: String, upperCaseFirstLetter : Boolean = true) : String = {
    val result = """(?:_|(\/)| )([a-z\d]*)""".r.replaceAllIn(term, m => {  m.group(2).capitalize } )		

    if (upperCaseFirstLetter) { 
      result.capitalize
    } else {
      result
    }
  }

  /**
    Makes an underscored, lowercase form from the expression in the string.
  */
  def underscore(camelCaseWord: String) : String = {
    """([a-z\d])([A-Z])""".r.replaceAllIn(
      """([A-Z\d]+)([A-Z][a-z])""".r.replaceAllIn(camelCaseWord, matcher => {
        matcher.group(1) + "_" + matcher.group(2)
      }), matcher => {
        matcher.group(1) + "_" + matcher.group(2)
      }
    ).toLowerCase
  }

  /** 
    Capitalizes the first word and turns underscores into spaces and strips a
    trailing "_id", if any.
  */
  def humanize(lowerCaseAndUnderscoredWord: String) : String = {
    """_id$""".r.replaceAllIn(lowerCaseAndUnderscoredWord, "").replaceAll("_", " ").capitalize
  }

  def ordinalize(number: Int) : String = {
    if (11 until 14 contains((number % 100).abs)) {
      "%dth".format(number)
    } else {
      (number % 10).abs match {
        case 1 => "%dst".format(number)
        case 2 => "%dnd".format(number)
        case 3 => "%drd".format(number)
        case _ => "%dth".format(number)
      }
    }
  }

  /**
   Replaces special characters in a string so that it may be used as part of a ‘pretty’ URL.
   */
  def parameterize(string: String, separator: String = "-") : String = {
    val separatorRegex = Pattern.quote(separator)
    val separatorRepeatedPattern = (separatorRegex + "{2,}").r
    val trimseparatorPattern = ("^" + separatorRegex + "|" + separatorRegex + "$").r

    trimseparatorPattern.replaceAllIn(
      separatorRepeatedPattern.replaceAllIn(
        """[^a-zA-Z0-9\-_]+""".r.replaceAllIn(transliterate(string), separator), ""), "").toLowerCase
  }

  /** Returns the plural form of the word in the string. */
  def pluralize(word: String) : String = {
    applyInflections(word, plural)
  }

  /** Returns the singular form of a word in a string. */
  def singularize(word: String) : String = {
    applyInflections(word, singular)
  }

  private def applyInflections(word: String, rules: List[(String, String)]) : String = {
    var matchUncounted = false

    uncountable.foreach((uncounted) => { 
      if ((uncounted + "$").r.findFirstIn(word) != None) matchUncounted = true 
    })

    if (word.length == 0 || matchUncounted) {
      return word
    }

    rules.foreach( (rule) => {
      val regexApplied = rule._1.r.replaceAllIn(word, rule._2)
      if (!regexApplied.equals(word)) return regexApplied
    })

    word  
  }

  /**
  This method converts alphabetic, numeric, and symbolic Unicode characters
  which are not in the first 127 ASCII characters (the "Basic Latin" Unicode
  block) into their ASCII equivalents, if one exists.

  Based on the implementation used in Apache Lucene
  http://svn.apache.org/repos/asf/lucene/dev/tags/lucene_solr_3_1/lucene/src/java/org/apache/lucene/analysis/ASCIIFoldingFilter.java
  */
  def transliterate(string: String) : String = {
    string.toList.map( (character) => {
      var replacementChar = character.toString

      breakable {
        if (character < 0x80) {
          break
        }

        unicodeMapping.foreach( (mapping) => {
          if (mapping._1.contains(character)) { 
            replacementChar = mapping._2
            break
          }
        } )
      }

      replacementChar
    }).mkString
  }
}
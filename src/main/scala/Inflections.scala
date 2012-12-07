import java.text.Normalizer
import java.util.regex.Pattern

object Inflections {
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
  def underscore(string: String) : String = {
    """([a-z\d])([A-Z])""".r.replaceAllIn(
      """([A-Z\d]+)([A-Z][a-z])""".r.replaceAllIn(string, matcher => {
        matcher.group(1) + "_" + matcher.group(2)
      }), matcher => {
        matcher.group(1) + "_" + matcher.group(2)
      }
    ).toLowerCase
  }

  def humanize(term: String) : String = {
    """_id$""".r.replaceAllIn(term, "").replaceAll("_", " ").capitalize
  }

  def ordinalize(term: Int) : String = {
    if (11 until 14 contains((term % 100).abs)) {
      "%dth".format(term)
    } else {
      (term % 10).abs match {
        case 1 => "%dst".format(term)
        case 2 => "%dnd".format(term)
        case 3 => "%drd".format(term)
        case _ => "%dth".format(term)
      }
    }
  }

  /**
   Replaces special characters in a string so that it may be used as part of a ‘pretty’ URL.
   */
  def parameterize(term: String, separator: String = "-") : String = {
    val separatorRegex = Pattern.quote(separator)
    val separatorRepeatedPattern = (separatorRegex + "{2,}").r
    val trimseparatorPattern = ("^" + separatorRegex + "|" + separatorRegex + "$").r

    trimseparatorPattern.replaceAllIn(
      separatorRepeatedPattern.replaceAllIn(
        """[^a-zA-Z0-9\-_]+""".r.replaceAllIn(transliterate(term), separator), ""), "").toLowerCase
  }

  def pluralize(word: String) : String = {
    applyInflections(word, InflectionsResource.plural)
  }

  def singularize(word: String) : String = {
    applyInflections(word, InflectionsResource.singular)
  }

  private def applyInflections(word: String, rules: List[(String, String)]) : String = {
    var matchUncounted = false
    InflectionsResource.uncountable.foreach((uncounted) => { 
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

  def transliterate(term: String) : String = {
    // http://www.jarvana.com/jarvana/view/org/apache/lucene/lucene-core/2.9.3/lucene-core-2.9.3-sources.jar!/org/apache/lucene/analysis/ASCIIFoldingFilter.java?format=ok
    term
  }
}
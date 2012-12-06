
object Inflections {
	def camelize(term: String, upperCaseFirstLetter : Boolean = true) : String = {
		val result = """(?:_|(\/)| )([a-z\d]*)""".r.replaceAllIn(term, m => {  m.group(2).capitalize } )		
    
    if (upperCaseFirstLetter) { 
      result.capitalize
    } else {
      result
    }
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
}
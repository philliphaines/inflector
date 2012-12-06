
object Inflections {
	def camelize(term: String, upperCaseFirstLetter : Boolean = true) : String = {
		val result = """(?:_|(\/)| )([a-z\d]*)""".r.replaceAllIn(term, m => {  m.group(2).capitalize } )		
    
    if (upperCaseFirstLetter) { 
      result.capitalize
    } else {
      result
    }
	}
}
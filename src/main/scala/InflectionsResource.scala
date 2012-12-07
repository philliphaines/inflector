
object InflectionsResource {
	val plural = List(
		("$", "s"),
		("s$", "s"),
	    ("(ax|test)is$", "$1es"),
	    ("(octop|vir)us$", "$1i"),
	    ("(octop|vir)i$", "$1i"),
	    ("(alias|status)$", "$1es"),
	    ("(bu)s$", "$1ses"),
	    ("(buffal|tomat)o$", "$1oes"),
	    ("([ti])um$", "$1a"),
	    ("([ti])a$", "$1a"),
	    ("sis$", "ses"),
	    ("(?:([^f])fe|([lr])f)$", "$1$2ves"),
	    ("(hive)$", "$1s"),
	    ("([^aeiouy]|qu)y$", "$1ies"),
	    ("(x|ch|ss|sh)$", "$1es"),
	    ("(matr|vert|ind)(?:ix|ex)$", "$1ices"),
	    ("([m|l])ouse$", "$1ice"),
	    ("([m|l])ice$", "$1ice"),
	    ("^(ox)$", "$1en"),
	    ("^(oxen)$", "$1"),
	    ("(quiz)$", "$1zes"),
	    ("person$", "people"),
	    ("man$", "men"),
	    ("child$", "children"),
   		("sex$", "sexes"),
    	("move$", "moves"),
    	("cow$", "kine")
	).reverse

	val uncountable = List(
		"equipment", "information", "rice", "money", 
		"species", "series", "fish", "sheep", "jeans",
		"news"
	)
}

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

	val singular = List(
		("s$", ""),
	    ("(n)ews$", "$1ews"),
	    ("([ti])a$", "$1um"),
	    ("((a)naly|(b)a|(d)iagno|(p)arenthe|(p)rogno|(s)ynop|(t)he)ses$", "$1$2sis"),
	    ("(^analy)ses$", "$1sis"),
	    ("([^f])ves$", "$1fe"),
	    ("(hive)s$", "$1"),
	    ("(tive)s$", "$1"),
	    ("([lr])ves$", "$1f"),
	    ("([^aeiouy]|qu)ies$", "$1y"),
	    ("(s)eries$", "$1eries"),
	    ("(m)ovies$", "$1ovie"),
	    ("(x|ch|ss|sh)es$", "$1"),
	    ("(m|l)ice$", "$1ouse"),
	    ("(bus)es$", "$1"),
	    ("(o)es$", "$1"),
	    ("(shoe)s$", "$1"),
	    ("(cris|ax|test)es$", "$1is"),
	    ("(octop|vir)i$", "$1us"),
	    ("(alias|status)es$", "$1"),
	    ("^(ox)en", "$1"),
	    ("(vert|ind)ices$", "$1ex"),
	    ("(matr)ices$", "$1ix"),
	    ("(quiz)zes$", "$1"),
	    ("(database)s$", "$1"),
	    ("people$", "person"),
	    ("men$", "man"),
	    ("children$", "child"),
   		("sexes$", "sex"),
    	("moves$", "move"),
    	("kine$", "cow")
    ).reverse

	val uncountable = List(
		"equipment", "information", "rice", "money", 
		"species", "series", "fish", "sheep", "jeans",
		"news"
	)
}
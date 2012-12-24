import org.specs2.mutable._

object InflectionsPluralizeSpec extends Specification {
		"pluralize" should {
		"pluralize search to searches" in {
			Inflections.pluralize("search") must be equalTo "searches"
		}
		"pluralize switch to switches" in {
			Inflections.pluralize("switch") must be equalTo "switches"
		}
		"pluralize fix to fixes" in {
			Inflections.pluralize("fix") must be equalTo "fixes"
		}
		"pluralize box to boxes" in {
			Inflections.pluralize("box") must be equalTo "boxes"
		}
		"pluralize process to processes" in {
			Inflections.pluralize("process") must be equalTo "processes"
		}
		"pluralize address to addresses" in {
			Inflections.pluralize("address") must be equalTo "addresses"
		}
		"pluralize case to cases" in {
			Inflections.pluralize("case") must be equalTo "cases"
		}
		"pluralize stack to switches" in {
			Inflections.pluralize("stack") must be equalTo "stacks"
		}

		"pluralize wish to wishes" in {
			Inflections.pluralize("wish") must be equalTo "wishes"
		}
		"pluralize fish to fish" in {
			Inflections.pluralize("fish") must be equalTo "fish"
		}
		"pluralize jeans to jeans" in {
			Inflections.pluralize("jeans") must be equalTo "jeans"
		}
		"pluralize funky jeans to funky jeans" in {
			Inflections.pluralize("funky jeans") must be equalTo "funky jeans"
		}
		"pluralize my money to my money" in {
			Inflections.pluralize("my money") must be equalTo "my money"
		}
		
		"pluralize my category to categories" in {
			Inflections.pluralize("category") must be equalTo "categories"
		}
		"pluralize query to queries" in {
			Inflections.pluralize("query") must be equalTo "queries"
		}
		"pluralize ability to abilities" in {
			Inflections.pluralize("ability") must be equalTo "abilities"
		}
		"pluralize agency to agencies" in {
			Inflections.pluralize("agency") must be equalTo "agencies"
		}
		"pluralize movie to movies" in {
			Inflections.pluralize("movie") must be equalTo "movies"
		}

		"pluralize archive to archives" in {
			Inflections.pluralize("archive") must be equalTo "archives"
		}

		"pluralize index to indices" in {
			Inflections.pluralize("index") must be equalTo "indices"
		}

		"pluralize wife to wives" in {
			Inflections.pluralize("wife") must be equalTo "wives"
		}
		"pluralize safe to saves" in {
			Inflections.pluralize("safe") must be equalTo "saves"
		}
		"pluralize half to halves" in {
			Inflections.pluralize("half") must be equalTo "halves"
		}

		"pluralize move to moves" in {
			Inflections.pluralize("move") must be equalTo "moves"
		}

		"pluralize salesperson to salespeople" in {
			Inflections.pluralize("salesperson") must be equalTo "salespeople"
		}
		"pluralize person to people" in {
			Inflections.pluralize("person") must be equalTo "people"
		}


		"pluralize spokesman to spokesmen" in {
			Inflections.pluralize("spokesman") must be equalTo "spokesmen"
		}
		"pluralize man to men" in {
			Inflections.pluralize("man") must be equalTo "men"
		}
		"pluralize woman to women" in {
			Inflections.pluralize("woman") must be equalTo "women"
		}

		"pluralize basis to bases" in {
			Inflections.pluralize("basis") must be equalTo "bases"
		}
		"pluralize diagnosis to diagnoses" in {
			Inflections.pluralize("diagnosis") must be equalTo "diagnoses"
		}
		"pluralize diagnosis_a to diagnosis_as" in {
			Inflections.pluralize("diagnosis_a") must be equalTo "diagnosis_as"
		}


		"pluralize datum to data" in {
			Inflections.pluralize("datum") must be equalTo "data"
		}
		"pluralize medium to media" in {
			Inflections.pluralize("medium") must be equalTo "media"
		}
		"pluralize stadium to stadia" in {
			Inflections.pluralize("stadium") must be equalTo "stadia"
		}
		"pluralize analysis to analyses" in {
			Inflections.pluralize("analysis") must be equalTo "analyses"
		}

		"pluralize node_child to node_children" in {
			Inflections.pluralize("node_child") must be equalTo "node_children"
		}
		"pluralize child to children" in {
			Inflections.pluralize("child") must be equalTo "children"
		}

		"pluralize experience to experiences" in {
			Inflections.pluralize("experience") must be equalTo "experiences"
		}
		"pluralize day to days" in {
			Inflections.pluralize("day") must be equalTo "days"
		}

		"pluralize comment to comments" in {
			Inflections.pluralize("comment") must be equalTo "comments"
		}
		"pluralize foobar to foobars" in {
			Inflections.pluralize("foobar") must be equalTo "foobars"
		}
		"pluralize newsletter to newsletters" in {
			Inflections.pluralize("newsletter") must be equalTo "newsletters"
		}


		"pluralize old_news to old_news" in {
			Inflections.pluralize("old_news") must be equalTo "old_news"
		}
		"pluralize news to news" in {
			Inflections.pluralize("news") must be equalTo "news"
		}

		"pluralize series to series" in {
			Inflections.pluralize("series") must be equalTo "series"
		}
		"pluralize species to species" in {
			Inflections.pluralize("species") must be equalTo "species"
		}

		"pluralize quiz to quizzes" in {
			Inflections.pluralize("quiz") must be equalTo "quizzes"
		}

		"pluralize perspective to perspectives" in {
			Inflections.pluralize("perspective") must be equalTo "perspectives"
		}

		"pluralize ox to oxen" in {
			Inflections.pluralize("ox") must be equalTo "oxen"
		}
		"pluralize photo to photos" in {
			Inflections.pluralize("photo") must be equalTo "photos"
		}
		"pluralize buffalo to buffaloes" in {
			Inflections.pluralize("buffalo") must be equalTo "buffaloes"
		}
		"pluralize tomato to tomatoes" in {
			Inflections.pluralize("tomato") must be equalTo "tomatoes"
		}
		"pluralize dwarf to dwarves" in {
			Inflections.pluralize("dwarf") must be equalTo "dwarves"
		}
		"pluralize elf to elves" in {
			Inflections.pluralize("elf") must be equalTo "elves"
		}
		"pluralize information to information" in {
			Inflections.pluralize("information") must be equalTo "information"
		}
		"pluralize equipment to equipment" in {
			Inflections.pluralize("equipment") must be equalTo "equipment"
		}
		"pluralize bus to buses" in {
			Inflections.pluralize("bus") must be equalTo "buses"
		}
		"pluralize status to statuses" in {
			Inflections.pluralize("status") must be equalTo "statuses"
		}
		"pluralize status_code to status_codes" in {
			Inflections.pluralize("status_code") must be equalTo "status_codes"
		}
		"pluralize mouse to mice" in {
			Inflections.pluralize("mouse") must be equalTo "mice"
		}

		"pluralize louse to lice" in {
			Inflections.pluralize("louse") must be equalTo "lice"
		}
		"pluralize house to houses" in {
			Inflections.pluralize("house") must be equalTo "houses"
		}
		"pluralize octopus to octopi" in {
			Inflections.pluralize("octopus") must be equalTo "octopi"
		}
		"pluralize virus to viri" in {
			Inflections.pluralize("virus") must be equalTo "viri"
		}
		"pluralize alias to aliases" in {
			Inflections.pluralize("alias") must be equalTo "aliases"
		}
		"pluralize portfolio to portfolios" in {
			Inflections.pluralize("portfolio") must be equalTo "portfolios"
		}

		"pluralize vertex to vertices" in {
			Inflections.pluralize("vertex") must be equalTo "vertices"
		}
		"pluralize matrix to matrices" in {
			Inflections.pluralize("matrix") must be equalTo "matrices"
		}
		"pluralize matrix_fu to portfolios" in {
			Inflections.pluralize("matrix_fu") must be equalTo "matrix_fus"
		}

		"pluralize axis to axes" in {
			Inflections.pluralize("axis") must be equalTo "axes"
		}
		"pluralize testis to testes" in {
			Inflections.pluralize("testis") must be equalTo "testes"
		}
		"pluralize crisis to crises" in {
			Inflections.pluralize("crisis") must be equalTo "crises"
		}

		"pluralize rice to rice" in {
			Inflections.pluralize("rice") must be equalTo "rice"
		}
		"pluralize shoe to shoes" in {
			Inflections.pluralize("shoe") must be equalTo "shoes"
		}
		"pluralize Shoe to Shoes" in {
			Inflections.pluralize("Shoe") must be equalTo "Shoes"
		}

		"pluralize horse to horses" in {
			Inflections.pluralize("horse") must be equalTo "horses"
		}
		"pluralize prize to prizes" in {
			Inflections.pluralize("prize") must be equalTo "prizes"
		}
		"pluralize edge to edges" in {
			Inflections.pluralize("edge") must be equalTo "edges"
		}

		"pluralize cow to kine" in {
			Inflections.pluralize("cow") must be equalTo "kine"
		}
		"pluralize database to databases" in {
			Inflections.pluralize("database") must be equalTo "databases"
		}		
	}
}
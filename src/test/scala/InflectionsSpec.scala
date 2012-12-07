import org.specs2.mutable._
import org.specs2.mock.Mockito

object InflectionsSpec extends Specification {
	"camelize" should {
		"camel case active_model to ActiveModel" in {
			Inflections.camelize("active_model") must be equalTo("ActiveModel")
		}
		"camel case active_model to activeModel" in {
			Inflections.camelize("active_model", upperCaseFirstLetter = false) must be equalTo("activeModel")	
		}
		"camel case active model to activeModel" in {
			Inflections.camelize("active model", upperCaseFirstLetter = false) must be equalTo("activeModel")	
		}
		"camel case active model to ActiveModel" in {
			Inflections.camelize("active model") must be equalTo("ActiveModel")	
		}
		"camel case HTML 5 javascript to HTML5Javascript" in {
			Inflections.camelize("html 5 Javascript", false) must be equalTo("html5Javascript")	
		}
		"camel case html-5-javascript to Html5Javascript" in {
			Inflections.camelize("html 5 Javascript") must be equalTo("Html5Javascript")	
		}
		"camel case product to product" in {
			Inflections.camelize("product", false) must be equalTo("product")
		}
		"camel case special_guest_star to specialGuestStar" in {
			Inflections.camelize("special_guest_star", false) must be equalTo("specialGuestStar")
		}
		"camel case area51_controller to area51Controller" in  {
			Inflections.camelize("area51_controller", false) must be equalTo("area51Controller")
		}
	}	

	"underscore" should {
		"underscore Product to product" in {
			Inflections.underscore("Product") must be equalTo "product"			
		}
		"underscore specialGuestStar to special_guest_star" in {
			Inflections.underscore("specialGuestStar") must be equalTo "special_guest_star"
		}
		"underscore ApplicationController to application_controller" in {
			Inflections.underscore("ApplicationController") must be equalTo "application_controller"
		}
		"underscore Area51Controller to area51_controller" in {
			Inflections.underscore("Area51Controller") must be equalTo "area51_controller"
		}
	}

	"parameterize" should {
		"Donald E. Knuth parameterize to donald-e-knuth" in {
			Inflections.parameterize("Donald E. Knuth") must be equalTo "donald-e-knuth"
		}
		"Random text with *(bad)* characters parameterize to random-text-with-bad-characters" in {
		    Inflections.parameterize("Random text with *(bad)* characters") must be equalTo "random-text-with-bad-characters"
		}
		"Allow_Under_Scores parameterize to allow_under_scores" in {
		    Inflections.parameterize("Allow_Under_Scores") must be equalTo "allow_under_scores"
		}
		"Trailing bad characters!@# parameterize to trailing-bad-characters" in {
		    Inflections.parameterize("Trailing bad characters!@#") must be equalTo "trailing-bad-characters"
		}
		"!@#Leading bad characters parameterize to leading-bad-characters" in {    
		    Inflections.parameterize("!@#Leading bad characters") must be equalTo "leading-bad-characters"
		}
		"Squeeze   separators parameterize to squeeze-separators" in {    
		    Inflections.parameterize("Squeeze   separators") must be equalTo "squeeze-separators"
		}
		"Test with + sign parameterize to test-with-sign" in {    
		    Inflections.parameterize("Test with + sign") must be equalTo "test-with-sign"
		}
		    //Inflections.parameterize("Test with malformed utf8 \u0102") must be equalTo "test-with-malformed-utf8"
	}

	"parameterize with no separator" should {
		"Donald E. Knuth parameterize to donaldeknuth" in {
    		Inflections.parameterize("Donald E. Knuth", "") must be equalTo "donaldeknuth"
    	}
    	"With-some-dashes parameterize to with-some-dashes" in {
    		Inflections.parameterize("With-some-dashes", "") must be equalTo "with-some-dashes"
    	}
    	"Random text with *(bad)* characters parameterize to randomtextwithbadcharacters" in {
    		Inflections.parameterize("Random text with *(bad)* characters", "") must be equalTo "randomtextwithbadcharacters"
    	}
    	"Trailing bad characters!@# parameterize to trailingbadcharacters" in {
    		Inflections.parameterize("Trailing bad characters!@#", "") must be equalTo "trailingbadcharacters"
    	} 
    	"!@#Leading bad characters parameterize to leadingbadcharacters" in {
    		Inflections.parameterize("!@#Leading bad characters", "") must be equalTo "leadingbadcharacters"
    	}
    	"Squeeze   separators parameterize to squeezeseparators" in {    	
    		Inflections.parameterize("Squeeze   separators", "") must be equalTo "squeezeseparators"
    	} 
    	"Test with + sign parameterize to testwithsign" in {
    		Inflections.parameterize("Test with + sign", "") must be equalTo "testwithsign"
		}
  	}

  	"humanize" should {
		"humanize employee_salary to Employee salary" in {
			Inflections.humanize("employee_salary") must be equalTo "Employee salary"
		}
		"humanize employee_id to Employee" in {
			Inflections.humanize("employee_id") must be equalTo "Employee"
		}
		"humanize underground Underground" in {
			Inflections.humanize("underground") must be equalTo "Underground"
		}
  	}

	"ordinalize" should {
		"ordinalize -1..-9" in {
			Inflections.ordinalize(-1) must be equalTo "-1st"
	    	Inflections.ordinalize(-2) must be equalTo "-2nd"
	    	Inflections.ordinalize(-3) must be equalTo "-3rd"
	    	Inflections.ordinalize(-4) must be equalTo "-4th"
	    	Inflections.ordinalize(-5) must be equalTo "-5th"
	    	Inflections.ordinalize(-6) must be equalTo "-6th"
	    	Inflections.ordinalize(-7) must be equalTo "-7th"
	    	Inflections.ordinalize(-8) must be equalTo "-8th"
	    	Inflections.ordinalize(-9) must be equalTo "-9th"
    	}

    	"ordinalize -10, -11, -12, -13, -14, -20, -21, -22, -23 and -24" in {
			Inflections.ordinalize(-10) must be equalTo "-10th"
	    	Inflections.ordinalize(-11) must be equalTo "-11th"
	    	Inflections.ordinalize(-12) must be equalTo "-12th"
	    	Inflections.ordinalize(-13) must be equalTo "-13th"
	    	Inflections.ordinalize(-14) must be equalTo "-14th"
	    	Inflections.ordinalize(-20) must be equalTo "-20th"
	    	Inflections.ordinalize(-21) must be equalTo "-21st"
	    	Inflections.ordinalize(-22) must be equalTo "-22nd"
	    	Inflections.ordinalize(-23) must be equalTo "-23rd"
	    	Inflections.ordinalize(-24) must be equalTo "-24th"
    	}	

    	"ordinalize -100, -101, -102, -103, -104, -110, -111, -112 and -113" in  {
	    	Inflections.ordinalize(-100) must be equalTo "-100th"
		    Inflections.ordinalize(-101) must be equalTo "-101st"
		    Inflections.ordinalize(-102) must be equalTo "-102nd"
		    Inflections.ordinalize(-103) must be equalTo "-103rd"
		    Inflections.ordinalize(-104) must be equalTo "-104th"
		    Inflections.ordinalize(-110) must be equalTo "-110th"
		    Inflections.ordinalize(-111) must be equalTo "-111th"
		    Inflections.ordinalize(-112) must be equalTo "-112th"
		    Inflections.ordinalize(-113) must be equalTo "-113th"
		    Inflections.ordinalize(-1000) must be equalTo "-1000th"
		    Inflections.ordinalize(-1001) must be equalTo "-1001st"
		}

		"ordinalize 0..9" in {
			Inflections.ordinalize(0) must be equalTo "0th"
		    Inflections.ordinalize(1) must be equalTo "1st"
		    Inflections.ordinalize(2) must be equalTo "2nd"
		    Inflections.ordinalize(3) must be equalTo "3rd"
		    Inflections.ordinalize(4) must be equalTo "4th"
		    Inflections.ordinalize(5) must be equalTo "5th"
		    Inflections.ordinalize(6) must be equalTo "6th"
		    Inflections.ordinalize(7) must be equalTo "7th"
		    Inflections.ordinalize(8) must be equalTo "8th"
		    Inflections.ordinalize(9) must be equalTo "9th"
		}

		"ordinalize 10, 11, 12, 13, 14, 20, 21, 22, 23 and 24" in {
			Inflections.ordinalize(10) must be equalTo "10th"
		    Inflections.ordinalize(11) must be equalTo "11th"
		    Inflections.ordinalize(12) must be equalTo "12th"
		    Inflections.ordinalize(13) must be equalTo "13th"
		    Inflections.ordinalize(14) must be equalTo "14th"
		    Inflections.ordinalize(20) must be equalTo "20th"
		    Inflections.ordinalize(21) must be equalTo "21st"
		    Inflections.ordinalize(22) must be equalTo "22nd"
		    Inflections.ordinalize(23) must be equalTo "23rd"
		    Inflections.ordinalize(24) must be equalTo "24th"
		}

		"ordinalize 100, 101, 102, 103, 104, 110, 111, 112, 113, 1000, 1001" in {
			Inflections.ordinalize(100) must be equalTo "100th"
		    Inflections.ordinalize(101) must be equalTo "101st"
		    Inflections.ordinalize(102) must be equalTo "102nd"
		    Inflections.ordinalize(103) must be equalTo "103rd"
		    Inflections.ordinalize(104) must be equalTo "104th"
		    Inflections.ordinalize(110) must be equalTo "110th"
		    Inflections.ordinalize(111) must be equalTo "111th"
		    Inflections.ordinalize(112) must be equalTo "112th"
		    Inflections.ordinalize(113) must be equalTo "113th"
		    Inflections.ordinalize(1000) must be equalTo "1000th"
		    Inflections.ordinalize(1001) must be equalTo "1001st"
		}
	}

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
import org.specs2.mutable._

object InflectionsSingularizeSpec extends Specification {
		"singularize" should {
		"singularize searches to search" in {
			Inflections.singularize("searches") must be equalTo "search"
		}
		"singularize switches to switch" in {
			Inflections.singularize("switches") must be equalTo "switch"
		}
		"singularize fixes to fix" in {
			Inflections.singularize("fixes") must be equalTo "fix"
		}
		"singularize boxes to box" in {
			Inflections.singularize("boxes") must be equalTo "box"
		}
		"singularize processes to process" in {
			Inflections.singularize("processes") must be equalTo "process"
		}
		"singularize addresses to address" in {
			Inflections.singularize("addresses") must be equalTo "address"
		}
		"singularize cases to case" in {
			Inflections.singularize("cases") must be equalTo "case"
		}

		"singularize stacks to stack" in {
			Inflections.singularize("stacks") must be equalTo "stack"
		}
		"singularize wishes to wish" in {
			Inflections.singularize("wishes") must be equalTo "wish"
		}
		"singularize fish to fish" in {
			Inflections.singularize("fish") must be equalTo "fish"
		}
		"singularize jeans to jeans" in {
			Inflections.singularize("jeans") must be equalTo "jeans"
		}
		"singularize funky jeans to funky jeans" in {
			Inflections.singularize("funky jeans") must be equalTo "funky jeans"
		}
		"singularize my money to my money" in {
			Inflections.singularize("my money") must be equalTo "my money"
		}

		"singularize categories to category" in {
			Inflections.singularize("categories") must be equalTo "category"
		}
		"singularize queries to query" in {
			Inflections.singularize("queries") must be equalTo "query"
		}
		"singularize abilities to ability" in {
			Inflections.singularize("abilities") must be equalTo "ability"
		}
		"singularize agencies to agency" in {
			Inflections.singularize("agencies") must be equalTo "agency"
		}
		"singularize movies to movie" in {
			Inflections.singularize("movies") must be equalTo "movie"
		}

		"singularize archives to archive" in {
			Inflections.singularize("archives") must be equalTo "archive"
		}

		"singularize indices to index" in {
			Inflections.singularize("indices") must be equalTo "index"
		}	

		"singularize wives to wife" in {
			Inflections.singularize("wives") must be equalTo "wife"
		}
		"singularize saves to safe" in {
			Inflections.singularize("saves") must be equalTo "safe"
		}
		"singularize halves to half" in {
			Inflections.singularize("halves") must be equalTo "half"
		}

		"singularize moves to move" in {
			Inflections.singularize("moves") must be equalTo "move"
		}

		"singularize salespeople to salesperson" in {
			Inflections.singularize("salespeople") must be equalTo "salesperson"
		}
		"singularize people to person" in {
			Inflections.singularize("people") must be equalTo "person"
		}

		"singularize spokesmen to spokesman" in {
			Inflections.singularize("spokesmen") must be equalTo "spokesman"
		}
		"singularize men to man" in {
			Inflections.singularize("men") must be equalTo "man"
		}
		"singularize woman to woman" in {
			Inflections.singularize("woman") must be equalTo "woman"
		}
		"singularize bases to basis" in {
			Inflections.singularize("bases") must be equalTo "basis"
		}
		"singularize diagnoses to diagnosis" in {
			Inflections.singularize("diagnoses") must be equalTo "diagnosis"
		}
		"singularize diagnosis_as to diagnosis_a" in {
			Inflections.singularize("diagnosis_as") must be equalTo "diagnosis_a"
		}

		"singularize data to datum" in {
			Inflections.singularize("data") must be equalTo "datum"
		}
		"singularize media to medium" in {
			Inflections.singularize("media") must be equalTo "medium"
		}
		"singularize stadia to stadium" in {
			Inflections.singularize("stadia") must be equalTo "stadium"
		}
		"singularize analyses to analysis" in {
			Inflections.singularize("analyses") must be equalTo "analysis"
		}

		"singularize node_children to node_child" in {
			Inflections.singularize("node_children") must be equalTo "node_child"
		}
		"singularize children to child" in {
			Inflections.singularize("children") must be equalTo "child"
		}

		"singularize experiences to experience" in {
			Inflections.singularize("experiences") must be equalTo "experience"
		}
		"singularize days to day" in {
			Inflections.singularize("days") must be equalTo "day"
		}

		"singularize comments to comment" in {
			Inflections.singularize("comments") must be equalTo "comment"
		}
		"singularize foobars to foobar" in {
			Inflections.singularize("foobars") must be equalTo "foobar"
		}
		"singularize newsletters to newsletter" in {
			Inflections.singularize("newsletters") must be equalTo "newsletter"
		}

		"singularize old_news to old_news" in {
			Inflections.singularize("old_news") must be equalTo "old_news"
		}
		"singularize news to news" in {
			Inflections.singularize("news") must be equalTo "news"
		}		

		"singularize series to series" in {
			Inflections.singularize("series") must be equalTo "series"
		}		
		"singularize species to species" in {
			Inflections.singularize("species") must be equalTo "species"
		}		

		"singularize quizzes to quiz" in {
			Inflections.singularize("quizzes") must be equalTo "quiz"
		}

		"singularize perspectives to perspective" in {
			Inflections.singularize("perspectives") must be equalTo "perspective"
		}

		"singularize oxen to ox" in {
			Inflections.singularize("oxen") must be equalTo "ox"
		}
		"singularize photos to photo" in {
			Inflections.singularize("photos") must be equalTo "photo"
		}
		"singularize buffaloes to buffalo" in {
			Inflections.singularize("buffaloes") must be equalTo "buffalo"
		}
		"singularize tomatoes to tomato" in {
			Inflections.singularize("tomatoes") must be equalTo "tomato"
		}
		"singularize dwarves to dwarf" in {
			Inflections.singularize("dwarves") must be equalTo "dwarf"
		}
		"singularize elves to elf" in {
			Inflections.singularize("elves") must be equalTo "elf"
		}

		"singularize information to information" in {
			Inflections.singularize("information") must be equalTo "information"
		}
		"singularize equipment to equipment" in {
			Inflections.singularize("equipment") must be equalTo "equipment"
		}
		"singularize buses to bus" in {
			Inflections.singularize("buses") must be equalTo "bus"
		}
		"singularize statuses to status" in {
			Inflections.singularize("statuses") must be equalTo "status"
		}
		"singularize status_codes to status_code" in {
			Inflections.singularize("status_codes") must be equalTo "status_code"
		}
		"singularize mice to mouse" in {
			Inflections.singularize("mice") must be equalTo "mouse"
		}

		"singularize lice to louse" in {
			Inflections.singularize("lice") must be equalTo "louse"
		}
		"singularize houses to house" in {
			Inflections.singularize("houses") must be equalTo "house"
		}
		"singularize octopi to octopus" in {
			Inflections.singularize("octopi") must be equalTo "octopus"
		}
		"singularize viri to virus" in {
			Inflections.singularize("viri") must be equalTo "virus"
		}
		"singularize aliases to alias" in {
			Inflections.singularize("aliases") must be equalTo "alias"
		}
		"singularize portfolios to portfolio" in {
			Inflections.singularize("portfolios") must be equalTo "portfolio"
		}

		"singularize vertices to vertex" in {
			Inflections.singularize("vertices") must be equalTo "vertex"
		}
		"singularize matrices to matrix" in {
			Inflections.singularize("matrices") must be equalTo "matrix"
		}
		"singularize matrix_fus to matrix_fu" in {
			Inflections.singularize("matrix_fus") must be equalTo "matrix_fu"
		}

		"singularize axes to axis" in {
			Inflections.singularize("axes") must be equalTo "axis"
		}
		"singularize testes to testis" in {
			Inflections.singularize("testes") must be equalTo "testis"
		}
		"singularize crises to crisis" in {
			Inflections.singularize("crises") must be equalTo "crisis"
		}

		"singularize rice to rice" in {
			Inflections.singularize("rice") must be equalTo "rice"
		}
		"singularize shoes to shoe" in {
			Inflections.singularize("shoes") must be equalTo "shoe"
		}

		"singularize horses to horse" in {
			Inflections.singularize("horses") must be equalTo "horse"
		}
		"singularize prizes to prize" in {
			Inflections.singularize("prizes") must be equalTo "prize"
		}
		"singularize edges to edge" in {
			Inflections.singularize("edges") must be equalTo "edge"
		}

		"singularize kine to cow" in {
			Inflections.singularize("kine") must be equalTo "cow"
		}
		"singularize databases to database" in {
			Inflections.singularize("databases") must be equalTo "database"
		}
	}
}
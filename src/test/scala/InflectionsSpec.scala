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
}
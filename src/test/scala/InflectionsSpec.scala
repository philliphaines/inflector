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
}
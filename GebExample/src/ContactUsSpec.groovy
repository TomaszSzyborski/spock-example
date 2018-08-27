import geb.spock.GebReportingSpec;

class ContactUsSpec extends GebReportingSpec{
	
	def "Fill form on ContactuS page"(){
		
		to ContactUsPage
		
		println currentUrl
		
		"enter name "("Abodeqa")
		
		"Print trhe title of tab"()
	}

}

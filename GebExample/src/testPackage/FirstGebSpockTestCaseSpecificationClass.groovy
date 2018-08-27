package testPackage

import geb.spock.GebSpec
import pages.*
import pages.ContactUsPage

/*
 * 
 *1- we ned to extend with specification class
 *2- Implicit calling of browser instance 
 *3- Created one dependency jar that is going to have geb+spock related stuff and that
 *we have already added in our pom.xml
 * 
 */
class FirstGebSpockTestCaseSpecificationClass extends GebSpec  {
	
	//Specification class was going to have multiple number of feature methods
	
	def "Fill Contact us form and click on Sumit button"(){
		// Feature method is going have some short of blocks those blocks are like given, when then 
		//where , expect
		
		given:
		println("We are in given block")
		
		when: 
		
		to ContactUsPage
		"Clicking on Calabash"()
//		"enter name "("nameString")
//		"Enter email "("dd.test@abodeqa.com")
//		"Enter Comment in comment textarea"("Comment is nothing we are testing")
			
		//and:
		//"Click on submit button"()
		//"Clicking on Calabash"()
		
		then:
		//at MessageSubmittedPage
		println title
		
		
		}
}

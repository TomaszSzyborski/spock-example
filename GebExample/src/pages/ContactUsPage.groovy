package pages

import geb.Page
import modules.*


class ContactUsPage extends Page{
	
	//static url 
	
	
	
	static url = "/contact-us/"
	
	//currentURL = baseURL+static URL
	
	
	//At Checker
	
	static at ={
		title == "Contact Us - Abode QA"
		$("h1.page-title").isDisplayed()
	}
	
	static content ={
		// <navigatorName ><options map> <actual navigator>
		
	nameField(wait: true){	$("input.name") }
	emailField(wait: true) { $("input.email") }
	commentField(wait: true){ $("#contact-form-comment-g1280-comment") }
	submitButton(wait: true) { $("input.pushbutton-wide") }
	AllTabLink(wait: 10) {$("li.page_item a")}
	
	//Options Map
	/* wait : true 
	 * required : false 
	 * 
	 * 
	 * 
	 */	
		
	}
	
	def "enter name "(nameString){
		nameField.value(nameString)		
		assert nameField.value() == nameString
	}
	
	def "Enter email "(email)
	{
		emailField.value(email)
		assert emailField.value() == email
	}
	
	def "Call click method of module class"(){
		moduleTab."Abodeqa --> aboutUsTab"()

	}
	
	def "Enter Comment in comment textarea"(comment){
		commentField.value(comment)
	}
	
	def "Click on submit button"()
	{
		submitButton.click()
	}
	
	def "Clicking on Calabash"()
	{
		AllTabLink.any{ 
						if (it.text() == 'CALABASH'){
						it.click()
						//return false
				
		}
	
		}
	}

}

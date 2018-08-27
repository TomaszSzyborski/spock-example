
import geb.Browser
import pages.*

Browser.drive{
	go("http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html")
	
	//Textbox
	$("input[name='firstname']").value("FirsetName")
	$("input[name='lastname']").value "LastName"
	$("#datepicker") << "05/22/2016"
	
	
	//Radio Button
	$("#sex-0").click()
	
	//Checkbox
	$("#profession-0").click()
	
	//File Upload
	
	$("#photo").value("B:\\New folder\\eclipse-jee-mars-2-win32\\eclipse\\workspace\\GebExample\\pom.xml")
	
	//Dropdown
	
	$("form").continents = "Europe"
	$("#continents").value("Australia")
}

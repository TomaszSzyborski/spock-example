import geb.Browser
import org.openqa. selenium.chrome.ChromeDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.Keys

def browser = new Browser(driver: new ChromeDriver())

browser.go("http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html")

//Textbox
browser.$("input[name='firstname']").value("FirsetName")
browser.$("input[name='lastname']").value "LastName"
browser.$("#datepicker") << "05/22/2016"


//Radio Button
browser.$("#sex-0").click()

//Checkbox
browser.$("#profession-0").click()

//File Upload

browser.$("#photo").value("B:\\New folder\\eclipse-jee-mars-2-win32\\eclipse\\workspace\\GebExample\\pom.xml")

//Dropdown

browser.$("form").continents = "Europe"
browser.$("#continents").value("Australia")
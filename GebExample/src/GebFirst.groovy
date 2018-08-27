
import geb.Browser
import org.openqa.selenium.firefox.FirefoxDriver

def browser = new Browser(driver : new FirefoxDriver())

browser.go("http://udemy.com")


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ShadowExample {
	
	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		
		Screen s = new Screen();
		
		Pattern pt = new Pattern("C:\\Images\\email.PNG");
		
		try {
			s.wait(pt,20);
			s.type(pt,"dwarika1987");
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

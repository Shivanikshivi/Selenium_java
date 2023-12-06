package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\user\\eclipse-workspace\\Java_project1\\src\\selenium\\demoblaze.java");
	        
	        WebDriver driver = new ChromeDriver();
	 
	        
	        driver.manage().window().maximize();
	        driver.navigate().to("https://www.demoblaze.com/");
	        
	        if (driver.title == 'Store')
	        {
	          System.out.println("Page landed on correct website")
	        }
	        else
	        {
	            System.out.println("Page not landed on correct website")
	        }

	        driver.quit();
	}
}
	
	



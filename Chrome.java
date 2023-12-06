package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chrome {
	public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\user\\eclipse-workspace\\Java_project1\\src\\selenium\\Chrome.java");
        
        WebDriver driver = new ChromeDriver();
 
        
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.quit();
    }
	
}

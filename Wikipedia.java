package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Wikipedia {

	public static void main(String[] args) {
		

        System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\user\\eclipse-workspace\\Java_project1\\src\\selenium\\Wikipedia.java");
        WebDriver driver = new ChromeDriver();
 
        
        driver.manage().window().maximize();
        driver.navigate().to("https://www.wikipedia.org/");
        
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("artificial intelligence");
        searchInput.submit();

      
        WebElement historyLink = driver.findElement(By.linkText("History"));
        historyLink.click();

     
        WebElement historySection = driver.findElement(By.id("History"));
        WebElement sectionTitle = historySection.findElement(By.tagName("span"));
        System.out.println("Title of the History section: " + sectionTitle.getText());

        driver.quit();
    
	}

}

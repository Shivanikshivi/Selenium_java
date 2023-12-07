package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

    public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Java_project1\\src\\selenium\\Chrome.java");

      
        WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize();

        
        driver.get("https://the-internet.herokuapp.com/iframe");

        
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframe);

        
        WebElement paragraph = driver.findElement(By.tagName("p"));
        paragraph.clear();
        paragraph.sendKeys("Hello people");

        
        driver.quit();
    }
}

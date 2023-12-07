package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandling {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Java_project1\\src\\selenium\\Chrome.java");

        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/windows");

        String originalWindow = driver.getWindowHandle();

        WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();

        
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        
        String newWindowText = driver.findElement(By.tagName("h3")).getText();
        if (newWindowText.equals("New Window")) {
            System.out.println("Text 'New Window' is present on the new window");
        }

        driver.close();

        
        driver.switchTo().window(originalWindow);

       
        if (driver.getWindowHandle().equals(originalWindow)) {
            System.out.println("Original window is active");
        }

       
        driver.quit();
    }
}
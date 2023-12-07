package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Jquerry{

    public static void main(String[] args) {
      
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Java_project1\\src\\selenium\\Chrome.java");

        
        WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize();

       
        driver.get("https://jqueryui.com/datepicker/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.seconds);

        driver.switchTo().frame(0); 

        WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
        nextMonthButton.click();

       
        WebElement date22 = driver.findElement(By.xpath("//a[text()='22']"));
        date22.click();

        
        WebElement selectedDate = driver.findElement(By.id("datepicker"));
        String selectedDateText = selectedDate.getAttribute("value");

      
        System.out.println("Selected date: " + selectedDateText);

       
        driver.quit();
    }
}

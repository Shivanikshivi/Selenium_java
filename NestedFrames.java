package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

    public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Java_project1\\src\\selenium\\Chrome.java");

        
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
   
        driver.get("http://the-internet.herokuapp.com/nested_frames");

        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));

        int frameCount = driver.findElements(By.cssSelector("frame[name='frame-top'] frame")).size();
        if (frameCount == 3) {
            System.out.println("There are three frames on the page");
        }

        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-left']")));

        String leftFrameText = driver.findElement(By.tagName("body")).getText();
        if (leftFrameText.contains("LEFT")) {
            System.out.println("Left frame has the text 'LEFT'");
        }

        driver.switchTo().defaultContent();
        WebElement topFrame = driver.findElement(By.cssSelector("frame[name='frame-top']"));
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));

       
        String middleFrameText = driver.findElement(By.tagName("body")).getText();
        if (middleFrameText.contains("MIDDLE")) {
            System.out.println("Middle frame has the text 'MIDDLE'");
        }

       
        driver.switchTo().defaultContent();

        
        driver.quit();
    }
}

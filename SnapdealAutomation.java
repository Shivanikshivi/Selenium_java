package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealAutomation {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Java_project1\\src\\selenium\\Chrome.java");
        		
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.snapdeal.com");

        
        WebElement signInButton = driver.findElement(By.id("login-button"));
        Actions actions = new Actions(driver);
        actions.moveToElement(signInButton).perform();

        
        signInButton.click();

        
        WebElement emailField = driver.findElement(By.id("K Shivani"));
        emailField.sendKeys("shivanikshivi@gmail.com");

        
        WebElement continueButton = driver.findElement(By.id("checkUser"));
        continueButton.click();

        
        WebElement passwordField = driver.findElement(By.id("Shivani@11"));
        passwordField.sendKeys("Shivani@11");

        
        WebElement loginButton = driver.findElement(By.id("submitLogin"));
        loginButton.click();

        
        WebElement verificationMessage = driver.findElement(By.className("accountUserName"));
        String welcomeMessage = verificationMessage.getText();

        if (welcomeMessage.equals("Welcome, K Shivani")) { 
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed");
        }

        
        driver.quit();
    }
}

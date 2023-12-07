package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Guvi{

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Java_project1\\src\\selenium\\Chrome.java");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://www.guvi.in/");

        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.seconds);

        
        WebElement signupButton = driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]"));
        signupButton.click();

        
        WebElement nameInput = driver.findElement(By.id("inputName"));
        nameInput.sendKeys("Shivani");

        WebElement emailInput = driver.findElement(By.id("inputEmail"));
        emailInput.sendKeys("shivanikshivi@gmail.com");

        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("Shivani@20");

      
        WebElement signupSubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
        signupSubmitButton.click();

      
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.seconds);

        WebElement successMessage = driver.findElement(By.xpath("//div[contains(text(),'Registration successful')]"));
        if (successMessage.isDisplayed()) {
            System.out.println("User registered successfully!");
        } else {
            System.out.println("Registration failed!");
        }

        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginButton.click();

       
        WebElement loginEmailInput = driver.findElement(By.id("loginEmail"));
        loginEmailInput.sendKeys("your.email@example.com");

        WebElement loginPasswordInput = driver.findElement(By.id("loginPassword"));
        loginPasswordInput.sendKeys("YourPassword");

       
        WebElement loginSubmitButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        loginSubmitButton.click();

        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        
        WebElement loggedInUser = driver.findElement(By.xpath("//span[contains(text(),'Welcome')]"));
        if (loggedInUser.isDisplayed()) {
            System.out.println("User logged in successfully!");
        } else {
            System.out.println("Login failed!");
        }

        
        driver.quit();
    }
}

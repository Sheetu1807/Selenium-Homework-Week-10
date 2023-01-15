package project_4_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsing {

    static String browser = "Chrome";

    static String baseURL = "https://www.saucedemo.com/";

    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webDriver.chrome.driver","src/drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webDriver.gecko.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webDriver.edge.driver", "src/drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();

        } else {
            System.out.println("Not valid browser");
        }

        driver.get(baseURL); // Method to invoke URL
        driver.manage().window().maximize(); // Maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Timeout session

        String title = driver.getTitle(); // Storing title
        System.out.println("Title of the page :" + title); // Printing title in the console

        String source = driver.getPageSource();
        System.out.println("Page source :" + source);

        driver.findElement(By.id("user-name")).click();
        WebElement usernameField = driver.findElement(By.id("user-name")); // Storing email fields
        usernameField.sendKeys("standard_user"); // Sending keys to email id field
        driver.findElement((By.id("password"))).click();
        WebElement passwordField = driver.findElement((By.id("password"))); // Storing password field
        passwordField.sendKeys("secret_sauce"); // Sendkeys to password field
        driver.findElement(By.id("login-button")).click();

        driver.quit(); // Closing browser
    }
}

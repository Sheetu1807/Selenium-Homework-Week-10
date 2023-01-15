package project_5_ultimatega;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multibrowsing {

    static String browser = "Chrome";

    static String baseURL = "https://courses.ultimateqa.com/users/sign_in";

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

        driver.findElement(By.className("ico-login")).click(); // Clicking on login link
        WebElement emailIdField = driver.findElement(By.id("Email")); // Storing email fields
        emailIdField.sendKeys("sdussooa@gmail.com"); // Sending keys to email id field
        WebElement passwordField = driver.findElement(By.id("Password")); // Storing password field
        passwordField.sendKeys("Sd18071995"); // Sendkeys to password field

        driver.close(); // Closing browser
    }
}

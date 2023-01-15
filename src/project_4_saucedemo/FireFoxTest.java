package project_4_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {

    public static void main(String[] args) {

        String baseurl = "https://www.saucedemo.com/"; // Storing base URL
        System.setProperty("webDriver.gecko.driver","src/drivers/geckodriver.exe"); // Setting webDriver
        WebDriver driver = new FirefoxDriver(); // Creating object of FireFox webDriver
        driver.get(baseurl); // Method to invoke URL

        driver.manage().window().maximize(); // Maximizing windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Timeout session

        String title = driver.getTitle(); // Storing title
        System.out.println("Title of the page :" + title); // Printing title in console

        // OR...

        String url = driver.getCurrentUrl(); // Storing title
        System.out.println("current Url :" + url); // Printing title in console


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

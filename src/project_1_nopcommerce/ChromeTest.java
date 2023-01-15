package project_1_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {

    public static void main(String[] args) {

        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F"; // Storing base URL

        System.setProperty("webDriver.chrome.driver", "src/drivers/chromedriver.exe"); // Setting webDriver

        WebDriver driver = new ChromeDriver(); // Creating object of chrome webDriver

        driver.get(baseurl); // Method to invoke URL

        driver.manage().window().maximize(); // Maximizing windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Timeout session

        String title = driver.getTitle(); // Storing title
        System.out.println("Title of the page :" + title); // Printing title in console

        // OR...

        String url = driver.getCurrentUrl(); // Storing title
        System.out.println("current Url :" + url); // Printing title in console


        driver.findElement(By.className("ico-login")).click(); // Clicking on login link
        WebElement emailIdField = driver.findElement(By.id("Email")); // Storing email fields
        emailIdField.sendKeys("sdussooa@gmail.com"); // Sending keys to email id field
        WebElement passwordField = driver.findElement((By.id("Password"))); // Storing password field
        passwordField.sendKeys("Sd18071995"); // Sendkeys to password field


        driver.close(); // Closing browser

    }
}
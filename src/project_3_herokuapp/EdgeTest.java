package project_3_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {

    public static void main(String[] args) {

        String baseurl = "http://the-internet.herokuapp.com/login"; // Storing base URL
        System.setProperty("webDriver.msedge.driver","src/drivers/msedgedriver.exe"); // Setting webDriver
        WebDriver driver = new EdgeDriver(); // Creating object of Edge webDriver
        driver.get(baseurl); // Method to invoke URL

        driver.manage().window().maximize(); // Maximizing windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Timeout session

        String title = driver.getTitle(); // Storing title
        System.out.println("Title of the page :" + title); // Printing title in console

        // OR...

        String url = driver.getCurrentUrl(); // Storing title
        System.out.println("current Url :" + url); // Printing title in console



        WebElement usernameField = driver.findElement(By.id("username")); // Storing email fields
        usernameField.sendKeys("tomsmith"); // Sending keys to email id field
        WebElement passwordField = driver.findElement((By.id("password"))); // Storing password field
        passwordField.sendKeys("SuperSecretPassword!"); // Sendkeys to password field
        driver.findElement(By.className("radius")).click();

        driver.quit(); // Closing browser

    }
}


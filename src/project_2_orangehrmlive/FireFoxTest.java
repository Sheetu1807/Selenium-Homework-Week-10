package project_2_orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class FireFoxTest {

    public static void main(String[] args) {

        String baseurl = "https://opensource-demo.orangehrmlive.com/"; // Storing base URL
        System.setProperty("webDriver.geckodriver","src/drivers/msedgedriver.exe"); // Setting webDriver
        WebDriver driver = new EdgeDriver(); // Creating object of FireFox webDriver
        driver.get(baseurl); // Method to invoke URL

        driver.manage().window().maximize(); // Maximizing windows

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Timeout session

        String title = driver.getTitle(); // Storing title
        System.out.println("Title of the page :" + title); // Printing title in console

        // OR...

        String url = driver.getCurrentUrl(); // Storing title
        System.out.println("current Url :" + url); // Printing title in console

        driver.findElement(By.name("username")).click();
        WebElement usernameField = driver.findElement(By.name("username")); // Storing email fields
        usernameField.sendKeys("Admin"); // Sending keys to email id field
        driver.findElement(By.name("password")).click();
        WebElement passwordField = driver.findElement((By.name("password"))); // Storing password field
        passwordField.sendKeys("admin123"); // Sendkeys to password field


        //driver.quit(); // Closing browser
    }
}
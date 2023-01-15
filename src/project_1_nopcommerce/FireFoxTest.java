package project_1_nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FireFoxTest {

    public static void main(String[] args) {

        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F"; // Storing base URL
        System.setProperty("webDriver.geckodriver","src/drivers/msedgedriver.exe"); // Setting webDriver
        WebDriver driver = new EdgeDriver(); // Creating object of FireFox webDriver
        driver.get(baseurl); // Method to invoke URL
    }
}

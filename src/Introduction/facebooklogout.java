package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class facebooklogout {
    public static void main(String[] args) throws InterruptedException {
        // Initialize EdgeDriver
        WebDriver driver = new EdgeDriver();

        // Navigate to Facebook
        driver.get("https://www.facebook.com");

        // Enter username and password
        driver.findElement(By.id("email")).sendKeys("9704645054");
        driver.findElement(By.id("pass")).sendKeys("bhargavi989");

        // Click on the login button
        driver.findElement(By.name("login")).click();

        // Implicitly wait for the page to load
        //Thread.sleep(5000);

        // Close the notification if present
        try {
            WebElement notificationCloseButton = driver.findElement(By.xpath("//a[@title='Close']"));
            notificationCloseButton.click();
        } catch (Exception e) {
            System.out.println("No notification present.");
        }

        // Perform logout
        driver.findElement(By.id("userNavigationLabel")).click();
        driver.findElement(By.xpath("//span[text()='Log Out']")).click(); 

        // Close the browser
        driver.quit();
    }
}


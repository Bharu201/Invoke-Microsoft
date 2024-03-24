package Introduction;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Myfirstclassjava {
    public static void main(String[] args) {
        // Set the path to the Microsoft Edge WebDriver
        System.setProperty("webdriver.edge.driver", "path/to/msedgedriver.exe");
        
        // Initialize the Microsoft Edge driver
        WebDriver driver = new EdgeDriver();
        
        // Navigate to Facebook
        driver.get("https://www.facebook.com");
        
        // Enter username and password and login
        WebElement usernameElement = driver.findElement(By.id("email"));
        WebElement passwordElement = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        
        usernameElement.sendKeys("97046465054");
        passwordElement.sendKeys("bhargavi989");
        loginButton.click();
        
        // Implicitly wait for the page to load
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Check if login was successful
       // if(driver.getCurrentUrl().equals("https://www.facebook.com/")) {
          //  System.out.println("Login successful!");
            
            // Perform logout
            WebElement accountDropdown = driver.findElement(By.id("userNavigationLabel"));
            accountDropdown.click();
            WebElement logoutButton = driver.findElement(By.xpath("//span[text()='Log Out']"));
            logoutButton.click();
           // System.out.println("Logged out successfully!");
       // } else {
          //  System.out.println("Login failed!");
        //}
        
        // Close the browser
       // driver.quit();
    }
}

package Introduction;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.By;

public class Automate {
    public static void main(String[] args) {
        // Set the path to the Microsoft Edge WebDriver
       // System.setProperty("webdriver.edge.driver", "path/to/msedgedriver.exe");
        
        // Initialize the Microsoft Edge driver
    	
    	 EdgeOptions option = new EdgeOptions();
		option.addArguments("--disable-notifications");
        
		WebDriver driver = new EdgeDriver();
      
        
        // Navigate to Facebook
        driver.get("https://www.facebook.com");
        
        
        
        // Login
        driver.findElement(By.id("email")).sendKeys("YourUsername");
        driver.findElement(By.id("pass")).sendKeys("YourPassword");
        driver.findElement(By.id("loginbutton")).click();
        
        // Implicit wait for the page to load
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Logout
       // driver.findElement(By.id("userNavigationLabel")).click();
        //driver.findElement(By.xpath("//span[text()='Log Out']")).click();
        
        driver.close();
        //driver.quit();
    }
}


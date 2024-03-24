package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Bhargavi {
	public static void main(String[] args) throws InterruptedException {
	
		EdgeOptions Options = new EdgeOptions();

		Options.addArguments("--disable-notifications");
	
		WebDriver driver = new EdgeDriver(Options);
		
		
		
	driver.get("https://www.facebook.com/");
    driver.findElement(By.name("email")).sendKeys("9704645054");
    //Thread.sleep(5000);
    driver.findElement(By.name("pass")).sendKeys("bhargavi989");
    Thread.sleep(5000);
    driver.findElement(By.name("login")).click();
    Thread.sleep(3000);
    
    
    
    
    //driver.findElement(By.id("userNavigationLabel")).click();
    //driver.findElement(By.xpath("//span[text()='Log Out']")).click();
    
    driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
    //System.out.println(driver.getTitle());
	///System.out.println(driver.getCurrentUrl());
	//driver.close();
			//driver.quit();
	
	}
}
	
 
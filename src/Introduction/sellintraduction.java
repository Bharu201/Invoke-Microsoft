package Introduction;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.*;
public class sellintraduction {

	public static void main(String[] args) {
		
		// Invoking Browser
		// MicrosoftEdge- Edge Driver ->Methods
		
		//System.setProperty("webdriver.edge.driver", "D:\\eclipse-java-2023-12-R-win32-x86_64edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
	
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
	}
     
}

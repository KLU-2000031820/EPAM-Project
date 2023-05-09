package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\indla\\Downloads\\chromedriver_win32/chromedriver.exe");
	   
        WebDriver webDriver = new ChromeDriver(); 
        webDriver.get("https://demo.guru99.com/test/delete_customer.php");			
		
	      	
        webDriver.findElement(By.name("cusid")).sendKeys("12345");					
        webDriver.findElement(By.name("submit")).submit();			
		
		// Switching to Alert        
		Alert alert = webDriver.switchTo().alert();		
		
		// Capturing alert message.    
		String alertMessage= webDriver.switchTo().alert().getText();		
		
		// Displaying alert message		
		System.out.println(alertMessage);	
		Thread.sleep(5000);
		
		// Accepting alert		
		alert.accept();		
	}
}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locators {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\indla\\Downloads\\chromedriver_win32/chromedriver.exe");
	   
        WebDriver webDriver = new ChromeDriver();
	    webDriver.get("https://www.facebook.com/");
	    webDriver.manage().window().maximize();
//	    webDriver.findElement(By.id("email")).sendKeys("ceppanbro@gmail.com");
//	    webDriver.findElement(By.id("pass")).sendKeys("789685@51423");
	    
	    webDriver.findElement(By.xpath("//div/input")).sendKeys("789685@51423");
	    webDriver.findElement(By.xpath("//div/div/div/input")).sendKeys("789685@51423");

//	    webDriver.findElement(By.cssSelector("input[type='text']")).sendKeys("ceppanbro@gmail.com");
//	    webDriver.findElement(By.cssSelector("input[type='password']")).sendKeys("789685@51423");
        webDriver.findElement(By.className("signin-button")).click();
		webDriver.close();	
	}

}

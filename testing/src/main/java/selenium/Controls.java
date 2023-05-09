package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Controls {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\indla\\Downloads\\chromedriver_win32/chromedriver.exe");
	   
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://demo.guru99.com/test/newtours/register.php");
        //Dropdown box
		Select drpCountry = new Select(webDriver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		webDriver.close();	
		
		
		//Radio Button
		webDriver.get("https://demo.guru99.com/test/radio.html");							
        //Radio Button1 is selected		
        webDriver.findElement(By.id("vfb-7-1")).click();			
        System.out.println("Radio Button Option 1 Selected");					
        //Radio Button2 is selected					
        webDriver.findElement(By.id("vfb-7-2")).click();			
        System.out.println("Radio Button Option 2 Selected");					
        		
        //CheckBox	
        //This will Toggle the Check box 		
        webDriver.findElement(By.id("vfb-6-0")).click();
        
		webDriver.close();	
	}

}

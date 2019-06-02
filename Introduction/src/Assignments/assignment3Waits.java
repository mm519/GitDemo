package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3Waits {

	public static final String driverDir = "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe"; //chromedriver.exe
	static { System.setProperty("webdriver.chrome.driver", driverDir); }
	public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
	
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//*[@id='content']/a[2]")).click();
		
		//Wait for an element to be clickable
		
		WebDriverWait Results = new WebDriverWait(driver,10);
		Results.until(ExpectedConditions.elementToBeClickable(By.id("results")));
		
		System.out.println(driver.findElement(By.id("results")).getText());

	}

}

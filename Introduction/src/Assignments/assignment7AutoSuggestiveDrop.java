package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment7AutoSuggestiveDrop {

	public static final String driverDir = "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe"; //chromedriver.exe
	static { System.setProperty("webdriver.chrome.driver", driverDir); }
	public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("united");
		System.out.println(driver.findElement(By.id("autocomplete")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script ="return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		while(!text.equalsIgnoreCase("United States")){
			
			i++;
			driver.findElement(By.id("autocomplete")).sendKeys((Keys.DOWN));
			
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10){
				break;
			}
		}
			if(i>10){
				System.out.println("Element not found");
			}
			else
			{
				System.out.println("Element Found");
			}
	}

}


package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2DropDownUIElements {
	
	public static final String driverDir = "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe";
	static { System.setProperty("webdriver.chrome.driver", driverDir); }
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		driver.get("https://www.cleartrip.com");
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		selectDropDown("Adults","2",false);
		selectDropDown("Childrens","4",false);
		selectDropDown("Infants","1",false);
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		
		selectDropDown("Class", "Economy", true);
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}
	
	public static void selectDropDown(String ID, String listValue, boolean text){
		Select select = new Select(driver.findElement(By.id(ID)));
		if (text) {
			select.selectByVisibleText(listValue);
		} else {
			select.selectByValue(listValue);
		}
	}

}

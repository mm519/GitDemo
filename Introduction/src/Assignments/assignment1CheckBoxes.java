package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1CheckBoxes {
	
	public static final String driverDir = "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe"; //chromedriver.exe
	static { System.setProperty("webdriver.chrome.driver", driverDir); }
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		verifyCheck("checkBoxOption1");
		driver.findElement(By.id("checkBoxOption1")).click();
		verifyCheck("checkBoxOption1");
		
	}
	
	public static void verifyCheck(String ID){
		WebElement check = driver.findElement(By.id(ID));
		if(check.isSelected()){
			System.out.println("Checkbox: CHECKED");
		}else{
			System.out.println("Checkbox: UNCHECKED");
		}	
	}
}

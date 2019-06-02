package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * select any checkbox
 * grab label of selected checkbox
 * select option in drop down value of label of selected checkbox, do not hardcode
 * enter value in edit box
 * select alert, and verify that text shows correct selected option
 */

public class assignment6AutomateElements {
	
	public static final String driverDir = "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe"; //chromedriver.exe
	static { System.setProperty("webdriver.chrome.driver", driverDir); }
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("//*[@id='checkBoxOption2']")).click();
		driver .findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		WebElement dropdown = null;
		Select s=new Select(dropdown);
		String opt = null;
		s.selectByVisibleText(opt);

        driver.findElement(By.name("enter-name")).sendKeys(opt);

        driver.findElement(By.id("alertbtn")).click();

     String text=  driver.switchTo().alert().getText();

     if(text.contains(opt)){
    	 System.out.println("Alert message success");
     	}else
    	 System.out.println("Something wrong with execution");
	}
	
}

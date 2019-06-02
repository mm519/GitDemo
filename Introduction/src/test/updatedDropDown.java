package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;

public class updatedDropDown {
public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://spicejet.com");
	
	//count the number of checkboxes
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
	
	driver.findElement(By.id("divapaxinfo")).click();
		Thread.sleep(2000L);

	System.out.println(driver.findElement(By.id("divaxinfo")).getText());

for(int i=1;i<5;i++){
	driver.findElement(By.id("hrefIncAdt")).click();
}

	driver.findElement(By.id("btncloseepaxoption")).click();

}
}
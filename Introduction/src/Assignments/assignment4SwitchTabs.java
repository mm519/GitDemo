package Assignments;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4SwitchTabs {

	public static final String driverDir = "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe"; //chromedriver.exe
	static { System.setProperty("webdriver.chrome.driver", driverDir); }
	public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		
		Set<String> newTab = driver.getWindowHandles();
		Iterator<String> tabs = newTab.iterator();
		String parentTab = tabs.next();
		String childTab = tabs.next();
		driver.switchTo().window(childTab);
		
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

		driver.switchTo().window(parentTab);

		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}

}

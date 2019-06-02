package Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1CheckBoxCount {
	
	public static final String driverDir = "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe"; //chromedriver.exe
	static { System.setProperty("webdriver.chrome.driver", driverDir); }
	public static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) {
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println("Number of Checkboxes: "+driver.findElements(By.cssSelector("[type='checkbox']")).size());
	}

}

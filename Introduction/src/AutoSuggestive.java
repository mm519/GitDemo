import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		
		WebElement source = driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']"));
		source.clear(); //clear data in edit box
		source.sendKeys("MUM"); //type values
		Thread.sleep(2000); //pauses for 2 seconds
		source.sendKeys(Keys.ENTER); //selecting ENTER
		
		WebElement destination = driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")); 
		destination.clear(); //clear data in edit box
		destination.sendKeys("DEL"); //type values
		Thread.sleep(2000); //pauses for 2 seconds
		destination.sendKeys(Keys.ARROW_DOWN); //arrow down
		destination.sendKeys(Keys.ENTER);
	}

}

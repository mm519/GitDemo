import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class facebookxpath {

	public static void main(String[] args) {
		//chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//tagName[@attribute='value'] - xpath
		/*
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("my own xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		*/
		
		//tagName[attribute='value']
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("mmurali519@gmail.com");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("miso_98");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

}

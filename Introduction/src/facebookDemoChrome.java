import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class facebookDemoChrome {
	public static void main (String[] args) {
		
		//chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://facebook.com"); //go to URL
		//driver.findElement(By.className("inputtext")).sendKeys("mmurali"); //type in email using name - reads left to right
		driver.findElement(By.id("email")).sendKeys("mmurali519@gmail.com"); //type in email username using the ID selector
		driver.findElement(By.name("pass")).sendKeys("miso_98"); //type in password using the name selector
		driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.linkText("Cancel")).click();
		driver.findElement(By.cssSelector(".fb_logo")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Meghna");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Murali");
	}

}

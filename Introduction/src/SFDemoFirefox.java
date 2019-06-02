import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SFDemoFirefox {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://test.salesforce.com");
		
		//confirm validity of x path by going to console and typing $x("xpath") to see if the right field is highlighted
		//selecting fields with xpath
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText()); //grab text from any browser
		
		
		//selecting fields with css selectors 
		//confirm validity of CSS of typing $("css") then highlight the output to see if the right field is highlighted
		/*
		driver.findElement(By.cssSelector("#username")).sendKeys("username");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
		driver.findElement(By.cssSelector("#forgot_password_link")).click();
		*/
				
				
				
	}

}

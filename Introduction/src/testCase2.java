import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		//Create Driver Object for Chrome Browser
		// We will strictly implement methods of webdriver
		/* Class name = ChromeDriver,
				
				X driver=new X();*/
		//invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qa.hibbertordering.com"); //goes to URL 
		System.out.println(driver.getTitle()); //validates page title
		System.out.println(driver.getCurrentUrl()); //validate if we have correct URL
		
		//Forgot Password 
		//driver.findElement(By.xpath("/html/body/main/main/div/form/a")).click(); //need to know how to get xpath
		//driver.findElement(By.id("userNameId")).sendKeys("mmurali");
		
		
		//Login by locating id
		driver.findElement(By.id("username")).sendKeys("mmurali");
		driver.findElement(By.id("password")).sendKeys("Hibbert1"); //id
		//driver.findElement(By.cssSelector("#password")).sendKeys("Hibbert1"); -- not right CSS. Look into this.
		driver.findElement(By.xpath("//*[@id='submitBtn']")).click(); //xpath
		
		
		
		
		//driver.get("https://qa.clientmanagement.hibbertordering.com");
		//driver.close(); //closes browser
		//driver.quit(); //it closes all the browsers opened by selenium 
	}

}


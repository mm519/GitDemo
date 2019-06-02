import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//javascript DOM can be used to extract hidden elements from a webpage. Selenium cannot identify hidden elements
//investigate the properties of object if it has any hidden text

public class autoSuggestiveDrop {

	public static final String driverDir = "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe"; //chromedriver.exe
	static { System.setProperty("webdriver.chrome.driver", driverDir); }
	public static WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		driver.get("https://www.ksrtc.in");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys((Keys.DOWN));
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		//javascript executor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script ="return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPRT")){
			
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys((Keys.DOWN));
			
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10){
				break;
			}
		}
			if(i>10){
				System.out.println("Element not found");
			}
			else
			{
				System.out.println("Element not found");
			}
	}

}

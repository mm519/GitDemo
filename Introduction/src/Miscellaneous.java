import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Miscellaneous {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/IN/");
		
		int number = findFrameNumber(driver, By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		
		int number1 = findFrameNumber(driver, By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//*[@id='recaptcha-verify-button']")).click();
	}
	
	public static int findFrameNumber(WebDriver driver, By by){
		
		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		
		for(i=0; i<framecount;i++){
		driver.switchTo().frame(i);
		int count = driver.findElements(by).size();
		
		if(count>0){
			break;
		}else
			System.out.println("continue looping");
		}
		
		driver.switchTo().defaultContent();
		return i;
	}
	
	
}

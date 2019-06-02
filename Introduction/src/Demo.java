import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author meghnm
 *
 */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://qa.hibbertordering.com"); //go to URL
		System.out.println(driver.getTitle()); //get title of page
		System.out.println(driver.getCurrentUrl()); //validate if we have correct URL
		
		//driver.navigate().back();
		
		//System.out.println(driver.getPageSource()); //print page source
	}

}

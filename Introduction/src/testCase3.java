import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://qa.hibbertordering.com");
		System.out.println(driver.getTitle());
	}

}

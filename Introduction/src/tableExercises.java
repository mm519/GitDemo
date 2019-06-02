import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableExercises {

	public static void main(String[] args) {
		
		int sum=0;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\meghnm\\hibbertWS\\projectFiles\\browserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++){
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger = Integer.parseInt(value);
			sum=sum+valueinteger;
		}
		
		
		String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int valueExtras = Integer.parseInt(Extras);
		int totalValue = sum + valueExtras;
		System.out.println(totalValue);
		
		String actualTotal = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualTotalValue = Integer.parseInt(actualTotal);
		if(actualTotalValue==totalValue){
			System.out.println("Count Matches");
		}else{
			System.out.println("Count Fails");
			System.out.println("Count Fails1");
			System.out.println("Count Fails3");
		}
		
	}

}

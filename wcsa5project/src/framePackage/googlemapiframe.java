package framePackage;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class googlemapiframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the webapplication
		driver.get("https://www.google.com/");
		
		

	}

}

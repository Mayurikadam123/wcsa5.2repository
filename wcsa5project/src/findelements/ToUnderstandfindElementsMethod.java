package findelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandfindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","./driver /chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("bikes");
		Thread.sleep(2000);
	List<webElement> bikes = driver.findElement("")

	}

}

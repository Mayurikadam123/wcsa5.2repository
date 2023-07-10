package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Chrome.driver","./driver /chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("mayurikadam20@gmail.com");
		Thread.sleep(4000);
	}

}

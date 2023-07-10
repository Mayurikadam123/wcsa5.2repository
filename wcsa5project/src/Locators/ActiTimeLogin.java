package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args)throws InterruptedException {
	
		System.setProperty("webdriver.Chrome.driver","./driver /chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mayuri/user/submit_tt.do");
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(2000);
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Logout")).click();
		 
		 
		 
		 
	
		
		
		
	}

}

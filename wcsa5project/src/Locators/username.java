
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class username {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","./driver /chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/acer/Desktop/WCSA5/webelement/usernametextfild.html");
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("manager");
		 Thread.sleep(2000);
		
		 
		 
	}

}

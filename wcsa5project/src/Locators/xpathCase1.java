package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","./driver /chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/i/flow/login");
		 driver.findElement(By.xpath("css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-xd6kpl r-1pn2ns4 r-ttdzmv")).sendKeys("mayurikadam20@gmail.com");
	}

}

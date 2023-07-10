package assignmentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","./driver /chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mayurikadam20@gmail.com");
        Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ganesh88");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@value='1']")).click();
	}
}

package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSychronaiztion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://mayuri/login.do");
		// Login page
String actualTitleOfLoginPage = driver.getTitle();
explicitWaitMethod(driver,30,actualTitleOfLoginPage);
System.out.println("Title is matched,Test Case Passed!!");
driver.findElement(By.name("username")).sendKeys("admin");
Thread.sleep(2000);
driver.findElement(By.name("pwd")).sendKeys("manager");

driver.findElement(By.id("loginButton")).click();

//Home page

		// "actiTIME - Enter Time-Track"

		System.out.println("Title is matched,Test Case Passed!!");
		// driver.findElement(By.linkText("Logout")).click();
		
	}
public static  void explicitWaitMethod(WebDriver driver,int sec,String title)

{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
	wait.until(ExpectedConditions.titleContains(title));
	
	}
	}


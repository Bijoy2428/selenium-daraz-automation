package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class asd {
	@Test
	public void firstTest()throws InterruptedException { 
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.daraz.com.bd/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//*[@class=\"grey\"])[3]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("asd");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("promit1122");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
    if(driver.findElement(By.xpath("//*[text()=\"The length of the Phone or Email should be 6-60 characters.\"]")).isDisplayed()) {
    	System.out.println("Passed");
    }
    else {
    	System.out.println("Failed");
    }
    
    
	
	//driver.quit();
}

}

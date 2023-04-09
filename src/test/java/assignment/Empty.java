package assignment;

import java.time.Duration;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Empty {
	
	
	@Test
	public void firstTest()throws InterruptedException { 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[@class=\"grey\"])[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("promit1122");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
        if(driver.findElement(By.xpath("(//*[text()=\"You can't leave this empty.\"])[1]")).isDisplayed()) {
        	System.out.println("Passed");
        }
        else {
        	System.out.println("Failed");
        }
      
		
        
	
		driver.quit();
		
		
		
	}
	}




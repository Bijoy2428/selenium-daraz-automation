package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invalid {
	@Test
	public void firstTest()throws InterruptedException { 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[@class=\"grey\"])[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("justpromit@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("prom1122");
		
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
		if(driver.findElement(By.className("next-feedback-content")).isDisplayed()) {
			System.out.println("passed");
			
		}
		else {
			System.out.println("failed");
		}
	}

}

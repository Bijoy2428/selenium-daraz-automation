package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart {
	
	@Test
	public void firstTest()throws InterruptedException { 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[@class=\"grey\"])[3]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("bijoy.s2428@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("bijoy@2428");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
        driver.getCurrentUrl();
		
		if(driver.getCurrentUrl().contains("https://www.daraz.com.bd/")) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}	

		
	    driver.findElement(By.id("q")).sendKeys("usb cable");
        driver.findElement(By.xpath("//*[@tabindex=\"2\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"module_add_to_cart\"]/div/button[2]/span")).click();
        
        

}
}

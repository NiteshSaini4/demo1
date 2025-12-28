package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo
{
	
	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@data-test='login-button']")).click();
		//driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		//driver.findElement(By.xpath("//div[text()='Sauce Labs Backpac']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpac')]")).click();
		
		
		

		
		
		
	}

	

}
//id
//name
//index
//xpath
//By.By.cssSelector()
//By.xpath
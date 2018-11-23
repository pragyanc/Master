package com.valuemomentum.Phoenix;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Notepad 
{
@Test
	public void test() throws Exception 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Patra\\workspace\\Phoenix\\src\\com\\valuemomentum\\Phoenix\\config.properties");
		Properties config=new Properties();
		config.load(fis);
		
		
		FileInputStream fis1=new FileInputStream("C:\\Users\\Patra\\workspace\\Phoenix\\src\\com\\valuemomentum\\Phoenix\\OR.properties");
		Properties or=new Properties();
		or.load(fis1);
		
		
		/*System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("QA_URL"));*/
		

		System.setProperty("webdriver.chrome.driver", "C:\\selenium1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		 
		 
		 driver.get(config.getProperty("QA_URL"));
		 driver.manage().window().maximize();
		 WebElement username=driver.findElement(By.xpath(or.getProperty("loginpage_username_xpath")));
		 username.sendKeys(config.getProperty("username"));
		 WebElement password=driver.findElement(By.id("Password"));
		 password.sendKeys("Password.1");
		 WebElement signIn=driver.findElement(By.id("recaptcha_Login"));
		 signIn.click();
		 
		 driver.quit();
	}
	
	

}

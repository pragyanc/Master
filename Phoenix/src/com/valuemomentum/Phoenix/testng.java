package com.valuemomentum.Phoenix;

import org.openqa.selenium.chrome.ChromeDriver;

public class testng 
{
	
	/*Launch the browser and open “gmail.com”.
	Verify the title of the page and print the verification result.
	Enter the username and Password.
	Click on the Sign in button.
	Close the web browser.*/
	
	public void gmail()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com/mail/u/0/");
		String Title=driver.getTitle();
		System.out.println(Title);
	}

}

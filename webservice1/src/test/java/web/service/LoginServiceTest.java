package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginSuccess() {
		System.setProperty(
				"webdriver.chrome.driver", 
				"/usr/local/Caskroom/chromedriver/124.0.6367.155/chromedriver-mac-x64/chromedriver");
		
		WebDriver driver = new ChromeDriver();		
		System.out.println("Driver info: " + driver);
		
		// Full path where login.html is located.
		// You can click on html file and copy the path shown in your browser.
		//
		driver.get("file:///Users/jahanzaib/Projects/Deakin%20Uni/Semester2/SIT707-WorkShop/Task%238.1/8.1P-resources/pages/login.html");

		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("Jahanzaib");
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("Khan");
		
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("11-09-1996");
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();
		
		sleep(5);
		
		/*
		 * On successful login, the title of page changes to 'success',
		 * otherwise, 'fail'.
		 */
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		Assert.assertEquals(title, "success");
		
		driver.close();
	}
}

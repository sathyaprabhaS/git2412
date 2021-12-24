package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path {
	
	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sasip\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("http://demo.automationtesting.in/Register.html");
	  
	  driver.manage().window().maximize();
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  String currentUrl = driver.getCurrentUrl();
	  System.out.println(currentUrl);
	  
	  WebElement txtdemo = driver.findElement(By.xpath("//h1[contains(text(),'Site')] "));
	  String demo = txtdemo.getText();
	  System.out.println(demo);
	 
	  WebElement txtfirstname = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
	  
	  txtfirstname.sendKeys("sathyaprabha");
	 
	  WebElement txtlastname = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
	  txtlastname.sendKeys("s");
	  
	  WebElement txtaddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	  txtaddress.sendKeys("Anna nagar,kallathur,Ariyalur(dt.)");
	  
	  WebElement txtmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	  txtmail.sendKeys("sathyaprabha2697mail.com");
	  
	  WebElement txtnum = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	  txtnum.sendKeys("7868941636");
	  
	  WebElement btnpress = driver.findElement(By.xpath("//input[@value='FeMale']"));
	  btnpress.click();
	  
	  WebElement btnhobby = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	  btnhobby.click();
	
	  WebElement txtlag = driver.findElement(By.xpath("//div[contains(@id,'m')]"));
	  
	  txtlag.click();
	  
	}

}

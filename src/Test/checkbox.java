package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {
public static void main(String[] args)
{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.irctc.co.in/");
	driver.findElement(By.name("otp")).click();
	
}
		
}

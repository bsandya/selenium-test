package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/");
		
		Boolean rrr =driver.findElement(By.name("otp")).isSelected();
		
		if(rrr=true)
		{
		System.out.println("is selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
	}
}

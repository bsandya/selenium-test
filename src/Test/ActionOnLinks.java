package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionOnLinks {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
	}
}

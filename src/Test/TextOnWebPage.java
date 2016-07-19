package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextOnWebPage {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		String str = driver.findElement(By.xpath(".//*[@id='nav-logo']/a/span[1]")).getText();
	System.out.println(str);
	}
	
}

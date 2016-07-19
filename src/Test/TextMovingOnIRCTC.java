package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextMovingOnIRCTC {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Thread.sleep(3000);
		String str = driver.findElement(By.xpath("html/body/div[1]/div/div[14]/div/div/marquee/span")).getText();
	System.out.println(str);
	}
}

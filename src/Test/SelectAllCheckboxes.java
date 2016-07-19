package Test;
import java.util.concurrent.TimeUnit;
import java.util.List;
//import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAllCheckboxes {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.className("gsfi")).sendKeys("selenium",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> check=driver.findElements(By.xpath(".//a"));
	int size =check.size();
		check.get(size-1).click();
		
	}
}

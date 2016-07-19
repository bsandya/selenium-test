package Test;
//import java.util.concurrent.TimeUnit;
//import java.util.List;
//import org.openqa.jetty.html.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectAllCheckboxes {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.echoecho.com");
		//List<WebElement> check=driver.findElements(By.xpath(".//input[@type='checkbox']"));
	/*int size =check.size();
		for(size=0;size<size; size++)
		{
			check.get(size).click();
		}
		*/
	}
}

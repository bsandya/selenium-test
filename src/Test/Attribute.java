package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
public class Attribute {
	public static void main(String[] args)throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement txt= driver.findElement(By.id("u_0_1"));
		String  val =txt.getAttribute("name");
		System.out.println(val);
		WebElement txtt= driver.findElement(By.id("u_0_3"));
		txtt.sendKeys("BOJJA");
		
		Thread.sleep(5000);
		String vall=txtt.getAttribute("value");
		System.out.println(vall);
	}
}

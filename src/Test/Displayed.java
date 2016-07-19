package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
public class Displayed {
	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.Facebook.com");
		WebElement txt= driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span"));
		Boolean status =txt.isDisplayed();
		if(status=true)
		{
			System.out.println("txt is present");
		}
		else
		{
			System.out.println("txt is not present");
		}
	}
}

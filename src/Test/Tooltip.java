package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
public class Tooltip {
	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement ele=driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a"));
		String txt=ele.getAttribute("title");
		System.out.println(txt);
}

}
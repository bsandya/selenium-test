package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnabledRDesabled {
	public static void main(String[] args)throws InterruptedException
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	WebElement searchbar = driver.findElement(By.className("gsfi"));
	boolean status= searchbar.isEnabled();
	if(status==true)
	{
	System.out.println("webelement is enabled");
	searchbar.sendKeys("selenium");
	driver.findElement(By.className("lsb")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='rso']/div[2]/div[1]/div/h3/a")).click();
	}
	else{
		System.out.println("webelement is disabled");
	}

}
}

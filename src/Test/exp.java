package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class exp {
 public static void main(String[] args)throws InterruptedException
 {
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://affimity.com/");
	driver.findElement(By.id("login-header")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys("sandyabojja@gmail.com");
	driver.findElement(By.name("password")).sendKeys("sandya");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
 }
}

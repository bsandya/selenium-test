package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
public class LoginButtonEnabled 
{
public static void main(String[] args)
{
WebDriver driver= new FirefoxDriver();
driver.get("https://www.Facebook.com");
WebElement button =driver.findElement(By.id("u_0_m"));
Boolean status = button.isEnabled();
if(status = true)
{
	System.out.println("button is enabled");
	button.click();
}
else
{
	System.out.println("button is disabled");
}
}
}

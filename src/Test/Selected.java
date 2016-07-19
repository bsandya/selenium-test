package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
public class Selected {
	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Boolean status= driver.findElement(By.xpath(".//*[@id='otpId']")).isSelected();
		//Boolean status =txt.isSelected();
		if(status=true)
		{
			System.out.println("checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selcetd");
			
		}
	}
}


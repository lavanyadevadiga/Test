import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void Login_method()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lavanya.Devadiga\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.datoms.io/login");
		driver.findElement(By.id("email")).sendKeys("lavanya1901@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("form_submit_btn")).click();
		
		String actual="https://accounts.datoms.io/login";
		String expected=driver.getCurrentUrl();
		if(actual.equals(expected))
		{
			System.out.println("string value matches "+expected);
		}
		
		driver.close();
	}

}

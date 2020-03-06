package vivahghar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class VivahGhar
{

	public static void main(String[] args) 
	{
		System.out.println("WELCOME");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kiran\\Desktop\\Selenium Vidya\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.vivahgharbooking.com/login");
		
		/*   WebElement registerButton=driver.findElement(By.xpath("//*[@id=guide-dropdown-invoker-2]"));   

		Actions act = new Actions(driver);
		
		act.moveToElement(registerButton).perform();
		
		List<WebElement> links=(List<WebElement>) driver.findElement(By.xpath("//a[contains(text(),'As Vendor')]"));
		
		int total_count=links.size();
		
		for(int j=0;j<total_count;j++);
		{
			
			int j = 0;
			WebElement registerButton1=links.get(j);
			
			String text=registerButton1.getAttribute("innerHTML");
			
			System.out.println("links name is->" +text);
		}
		
		WebElement loginButton=driver.findElement(By.xpath("/html/body/header/div/div/div/div/div[3]/ul/li[3]/a"));
		
		loginButton.click();   */
		
		
		driver.findElement(By.name("w_uname")).sendKeys("vidya");
		
		driver.findElement(By.name("w_pass")).sendKeys("k111111");
		
		WebElement signupbutton=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div/div[4]/button"));
		
		signupbutton.click();
		
		driver.getTitle();
		
		driver.getCurrentUrl();
		
		/*driver.get("https://www.vivahgharbooking.com/");
		
		WebElement registerButton=driver.findElement(By.xpath("//*[@id=guide-dropdown-invoker-2]"));   

		Actions act = new Actions(driver);
			
		act.moveToElement(registerButton).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'As Vendor')]")).click();
		
		driver.get("https://www.vivahgharbooking.com/signup/index");
		
		driver.findElement(By.id("w_uname")).sendKeys("kirti");
		
		driver.findElement(By.name("w_email")).sendKeys("vidya123@gmail.com");

		driver.findElement(By.id("w_number")).sendKeys("9876543210");
		
		driver.findElement(By.id("w_pass")).sendKeys("ABC@123");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/form/div/div[6]/button")).click();
		
		driver.get("https://www.vivahgharbooking.com/signup/user");
		
		driver.findElement(By.xpath("/html/body")).click();   */
		
		
		
		
		
		
		
		
	}

}

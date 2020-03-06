package charteredaccountants;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.Assert;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Kiran\\Desktop\\Selenium Vidya\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://ca-oms.com/");
		
		WebElement radio1 = driver.findElement(By.id("rbAdmin"));

		WebElement radio2 = driver.findElement(By.id("rbEmployee"));

		radio1.click();
			
		driver.findElement(By.id("txtUserName")).sendKeys("superadmin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("superadmin123");

		WebElement SignupButton = driver.findElement(By.id("btnSignIn"));

		SignupButton.click();
		
		//System.out.println(title);   title=CA Application
		String title=driver.getTitle();
		

		if(title.equals("CA Application"))
		{
			System.out.println("Login Successful");
		} 
		else
		{
			System.out.println("Login Failed");
		}
		//Assert.assertEquals("CA Application", title);
		
		
	}

}

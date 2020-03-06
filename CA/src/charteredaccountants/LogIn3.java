package charteredaccountants;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.Assert;

public class LogIn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Kiran\\Desktop\\Selenium Vidya\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://ca-oms.com/");
		
		WebElement radio1 = driver.findElement(By.id("rbAdmin"));

		WebElement radio2 = driver.findElement(By.id("rbEmployee"));

		//radio1.click();
			
		driver.findElement(By.id("txtUserName")).sendKeys("superadmin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("superadmin123");

		WebElement SignupButton = driver.findElement(By.id("btnSignIn"));

		SignupButton.click();
		
     	WebElement alertWebelment=driver.findElement(By.xpath("//button[@class='close']/following-sibling::b"));
		
		String warningMessage=alertWebelment.getText();
		
		if(warningMessage.equals("Warning !"))
		{
			System.out.println("Please select Admin/Superadmin or Employee before entering username and password");
		}
						
	}

}

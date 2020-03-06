package charteredaccountants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Kiran\\Desktop\\Selenium Vidya\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://ca-oms.com/EmployeeMaster.aspx");
			
			 WebElement searchbutton = driver.findElement(By.id("ContentPlaceHolder1_txtEmployeeNameSearch"));
		      
		      searchbutton.click();
		      
		      searchbutton.sendKeys("piya");
		      
		      WebElement searchbutton1 = driver.findElement(By.id("ContentPlaceHolder1_Submit2"));
		      
		      searchbutton1.click();
	}

}

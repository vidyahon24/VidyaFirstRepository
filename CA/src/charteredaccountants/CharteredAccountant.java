package 


charteredaccountants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CharteredAccountant 
{

	public static void main(String[] args) 
	{

		System.out.println("WELCOME");
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kiran\\Desktop\\Selenium Vidya\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
        JavascriptExecutor js = (JavascriptExecutor) driver;    //scroll window up down
		
		driver.get("http://ca-oms.com/");
		
		WebElement radio1 = driver.findElement(By.id("rbAdmin"));

		WebElement radio2 = driver.findElement(By.id("rbEmployee"));

		radio1.click();
			
		driver.findElement(By.id("txtUserName")).sendKeys("superadmin12");
		
		driver.findElement(By.id("txtPassword")).sendKeys("superadmin123");

		WebElement SignupButton = driver.findElement(By.id("btnSignIn"));

		SignupButton.click();
		
		String title=driver.getTitle();
		
		//System.out.println(title);   title=CA Application

		if(title.equals("CA Application"))
		{
			System.out.println("Login Successful");
		} 
		else
		{
			System.out.println("Login Failed");
		}
		
		driver.findElement(By.id("txtUserName")).clear();
		
		driver.findElement(By.id("txtPassword")).clear();
		
		driver.findElement(By.id("txtUserName")).sendKeys("superadmin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("superadmin123");

		WebElement SignupButton1 = driver.findElement(By.id("btnSignIn"));

		SignupButton1.click();
		
		//compare alert message
		
		String title2=driver.getTitle();

		if(title2.equals("alert alert-warning alert-dismissable"))
		{
			System.out.println("Login successfull");
		}
		else
		{
			System.out.println("Login Fail");
		}
		
		//compare successful login 
		
		String title1=driver.getTitle();

		if(title1.equals("CA Application"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
		//Dashboard
		
		int weather = 7;

	      switch (weather) 
	      {
	          
	        case 0:
	        {
	        	WebElement Allassignment = driver.findElement(By.id("ContentPlaceHolder1_BtnAll"));
	    		
	    		Allassignment.click();
	    		
	    		WebElement search = driver.findElement(By.id("ContentPlaceHolder1_txtSearch"));
	    		
	    		search.click();
	    		
	    		driver.findElement(By.id("ContentPlaceHolder1_txtSearch")).sendKeys("High");
	    		
                WebElement searchbutton = driver.findElement(By.id("ContentPlaceHolder1_btnSearch"));
	    		
	    		searchbutton.click();
	    		
	    		break;
	        }
	        case 1:
	        {
                WebElement Approvedassignment = driver.findElement(By.id("ContentPlaceHolder1_BtnApprove"));
	    		
                Approvedassignment.click();
                
                break;
	        }	
	        case 2:
	        {	
	        	 WebElement Completeassignment = driver.findElement(By.id("ContentPlaceHolder1_BtnComplete"));
		    		
	        	 Completeassignment.click();
	        	 
	        	 break;
	        }
	        
	        case 3:
	        {	
	        	 WebElement Processassignment = driver.findElement(By.id("ContentPlaceHolder1_BtnProcess"));
		    		
	        	 Processassignment.click();
	        	 
	        	 break;
	        }
	        
	        case 4:
	        {	
	        	 WebElement onholdassignment = driver.findElement(By.id("ContentPlaceHolder1_BtnOnhold"));
		    		
	        	 onholdassignment.click();
	        	 
	        	 break;
	        }
	        
	        case 5:
	        {	
	        	 WebElement customerassignment = driver.findElement(By.id("ContentPlaceHolder1_BtnCustomer"));
		    		
	        	 customerassignment.click();
	        	 
	        	 break;
	        }
	        
	        case 6:
	        {	
	        	 WebElement employeeassignment = driver.findElement(By.id("ContentPlaceHolder1_BtnEmployee"));
		    		
	        	 employeeassignment.click();
	        	 
	        	 break;
	        }
	        
	        default:
	        	
	          System.out.println("Invalid Input!");
	    }
		
		//Masters
	      
	    WebElement masters = driver.findElement(By.xpath("//*[@id='AdminMenu']/li[2]/a"));
  		
     	masters.click();
     	  
     	//Employee
     	
     	WebElement employee = driver.findElement(By.xpath("//*[@id='sub-1']/li[1]/a"));
		
		employee.click();
		
		//Employee info
		
		//name
		
        WebElement name = driver.findElement(By.id("ContentPlaceHolder1_txtName"));
		
		name.click();

		name.sendKeys("Vidya");
		
		//address
		
		WebElement address = driver.findElement(By.id("ContentPlaceHolder1_txtAddress"));
			
		address.click();
		
		address.sendKeys("pune");
		
		//mobile no
		
		WebElement mobileno = driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo"));
		
		mobileno.click();
		
		mobileno.sendKeys("7498972907");
		
		//email id
		
		WebElement email = driver.findElement(By.id("ContentPlaceHolder1_txtEmail"));
		
		email.click();
		
		email.sendKeys("kirtihon24@gmail.com");
		
		//username
		
        WebElement username = driver.findElement(By.id("ContentPlaceHolder1_txtUsername"));
		
		username.click();
		
		username.sendKeys("kirtu");
		
		//password
		
		WebElement password = driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));
		
		password.click();
		
		password.sendKeys("kirti123");
		
		//question
		
		WebElement question = driver.findElement(By.id("ContentPlaceHolder1_ddlSecurityQuestion"));
		
		question.click();
		
		Select dropdown = new Select(question);
		
		dropdown.selectByVisibleText("What is Your School Name?");
		
		//answer
		
		WebElement answer = driver.findElement(By.id("ContentPlaceHolder1_txtAnswer"));
		
		answer.click();
		
		answer.sendKeys("ABCDE");
		
		//date from calender
		
	    WebElement dateBox = driver.findElement(By.id("ContentPlaceHolder1_txtJoiningDate"));

	    dateBox.click();
	    
	    dateBox.clear();
	    
	    dateBox.sendKeys("25/09/2013");
	    
	    answer.click();
	    
	    //scroll window up and down
	    
        js.executeScript("window.scrollBy(0,200)");

		
		//working status
	    
	    WebElement radio3 = driver.findElement(By.id("ContentPlaceHolder1_rdoActive"));
	    
	    radio3.click();

	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;

		WebElement radio4 = driver.findElement(By.id("ContentPlaceHolder1_rdoInactive"));

		radio4.click();
	    
	    //save & cancel button
		
		int button = 2;

	      switch (button) 
	      {
	          
	        case 1:
	       
	        {
		
		     WebElement savebutton1 = driver.findElement(By.id("ContentPlaceHolder1_btnSave"));
		
	         savebutton1.click();
	        	
	         break;
	       
	        }
	        
	        case 2:
	        	
	        {
	        	
		    WebElement cancelbutton = driver.findElement(By.id("ContentPlaceHolder1_Submit1"));
		
		    cancelbutton.click();
		    
		    break;
	    
	        }
	    	
	     }
	      
	      //search
	      
	    /* WebElement searchbutton = driver.findElement(By.id("ContentPlaceHolder1_txtEmployeeNameSearch"));
	      
	      searchbutton.click();
	      
	      searchbutton.sendKeys("piya");
	      
	      WebElement searchbutton1 = driver.findElement(By.id("ContentPlaceHolder1_Submit2"));
	      
	      searchbutton1.click();*/
	      
	    //Masters
	      
	    masters.click();
	     	  
	    //service
	     	
	    WebElement service = driver.findElement(By.xpath("//*[@id='sub-1']/li[1]/a"));
			
	    service.click();
	    
	    //service name
	    
	    WebElement serviceName=driver.findElement(By.xpath("ContentPlaceHolder1_txtName"));
	    
	    serviceName.click();
	    
	    driver.findElement(By.xpath("ContentPlaceHolder1_txtName")).sendKeys("Tax");
			
	    //save button
	    
	    WebElement saveButton=driver.findElement(By.xpath("ContentPlaceHolder1_btnSave"));
	    
	    saveButton.click();
	    
	    
	    
	    
	}
	
}

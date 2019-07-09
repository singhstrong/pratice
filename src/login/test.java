package login;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import qa_objects.qa_functions_methods;

public class test {

	
	@Test()
	public void test() throws IOException
	{

	WebDriver driver=new FirefoxDriver();
	
	qa_functions_methods.openBrowser();
   qa_functions_methods.openurl();
	//functions.type(By.id(functions.readorfile("Login_Email")),functions.readDataFile("username"));
	
	
	driver.get("https://paytm.com/");
//	driver.findElements(By.xpath("//*[text()='Sign Up']"))).click();
	
	}
}


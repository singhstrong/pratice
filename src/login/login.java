package login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import qa_objects.qa_functions_methods;

public class login {

	public static WebDriver driver;

	public static void main(String args[]) throws IOException

	{
		qa_functions_methods.openBrowser();
		qa_functions_methods.openurl();
		qa_functions_methods.implictwait();
		qa_functions_methods.max();
		qa_functions_methods.implictwait();

		qa_functions_methods.verifyText("text-login",
				By.xpath(".//*[@id='logo_login']"));
		System.out.println("Verified");

		// qa_functions_methods.clicker(By.xpath(qa_functions_methods.readorFile("sign")));

		qa_functions_methods.implictwait();

		// driver.findElement(By.id("login_name")).sendKeys("nirbhaypalsingh");
		// driver.findElement(By.id("login_password")).sendKeys("babu@13");

		qa_functions_methods.type(
				By.xpath(qa_functions_methods.readorFile("email")),
				qa_functions_methods.readDataFile("id"));
		qa_functions_methods.type(
				By.xpath(qa_functions_methods.readorFile("pass")),
				qa_functions_methods.readDataFile("password"));
		qa_functions_methods.clicker(By.xpath(qa_functions_methods
				.readorFile("post")));

		qa_functions_methods.clicker(By.xpath(qa_functions_methods
				.readorFile("create")));

		// qa_functions_methods.switchframe(By.xpath("//iframe[@class='']"));

		qa_functions_methods.implictwait();

		// Select s=new
		// Select(driver.findElement(By.id("dropdown_type1886633174")));
		/*new Select(
				driver.findElement(
						By.name("type"))).selectByIndex(1);*/
		driver.findElement(By.xpath("//select[@name='type']"));
		
		Select dropdown = new Select(driver.findElement(By.name("type")));
		dropdown.selectByIndex(1);
		
		
		qa_functions_methods.implictwait();

		Select s1 = new Select(driver.findElement(By
				.id("dropdown_type_request1886633174")));

		s1.selectByValue("Others");

		// qa_functions_methods.type(By.xpath(qa_functions_methods.readorFile("phone")),qa_functions_methods.readDataFile("nirbhay"));

	}
}

package qa_objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;






import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class qa_functions_methods {
	
public static WebDriver driver ;


 public static String readDataFile(String Key) throws IOException
{
FileInputStream file=new FileInputStream("C:\\Users\\nirbhaypalsingh\\workspace\\paytm\\src\\qa_objects\\data.properties");
Properties p=new Properties();
p.load(file);
String value=p.getProperty(Key);
return value;
}


  public static String readorFile(String Keys) throws IOException 
{
FileInputStream file2=new FileInputStream("C:\\Users\\nirbhaypalsingh\\workspace\\paytm\\src\\object.properties");
Properties p1=new Properties();
p1.load(file2);
String value=p1.getProperty(Keys);
return value;
}


   public static void openBrowser() 
   {
	
	driver= new FirefoxDriver();
}
   
   public static void openurl() throws IOException 
   {

   	driver.get(readorFile("url"));

   }	
  public static void max()
{
  driver.manage().window().maximize();



	
}
public static void type(By by,CharSequence text)
	{
		driver.findElement(by).sendKeys(text);
	}


public static void clicker(By by) 
{
	driver.findElement(by).click();	
	
}


public static void implictwait() 

{
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	
	
}

public static void switchframe(By by)
{
	 driver.switchTo().frame(driver.findElement(by)); 
	 
}


public static void verifyText(String exp,By by)
	{
	try
	{
		String act=driver.findElement(by).getText();
	    Assert.assertEquals(act,exp);
		}
	catch(AssertionError e)
	{
		System.out.println("Text not present");
		//Reporter.log(exp +," ");
	}

	}


}


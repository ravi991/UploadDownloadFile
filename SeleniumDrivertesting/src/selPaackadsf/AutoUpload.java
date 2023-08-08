package selPaackadsf;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoUpload {
public static void main(String[] args) throws IOException, InterruptedException {
	
	ChromeDriver d = new ChromeDriver();
	   d.manage().window().maximize();
	   // for page load
	   d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");       // Testing webpage
	   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      // for Implicit wait
	             
	   WebElement uname = d.findElement(By.name("username"));          // Username.........ID
	   uname.sendKeys("Admin");
	     
	   WebElement pwd = d.findElement(By.name("password"));    // Password.........NAME
	   pwd.sendKeys("admin123");
	    
	   WebElement loginb = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	   loginb.click();                                   // Loginbutton......XPATH
	         
	 
	   WebElement pim = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"));
	    pim.click();                                            // Admin tab-PIM
	 
	   WebElement config = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span"));
	    config.click();                                  //Configuration tab
	 
	    WebElement data_imp = d.findElement(By.partialLinkText("Data Import"));
	    data_imp.click();                                 //Data Import tab.....PARTIALLINKT
	         
	 
	    // UPLOADING FILE USING AutoIT....
	     
	    WebElement browser = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div[1]"));   //Browse button
	    browser.click();                                
	    System.out.println("1");
	 
	 
	  Runtime.getRuntime().exec("C:\\Users\\truba\\Desktop\\sample.exe");
	  System.out.println("2");
	  Thread.sleep(3000);
	 
	  WebElement upload = d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button"));            //Upload button
	   upload.click();
	   System.out.println("3");     
	  
	   System.out.println("File Uploaded Successfully"); 
	   d.close();
}
}

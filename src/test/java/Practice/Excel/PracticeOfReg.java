package Practice.Excel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectRepository.Registration_Objects;

public class PracticeOfReg {
WebDriver driver;
@BeforeTest
	public void Login() throws InterruptedException 
	{
		System.setProperty("webdriver.Chrome.driver", "");
		 driver = new ChromeDriver();
		ChromeOptions C= new ChromeOptions();
		C.addArguments("--disable-notifications");
		driver.get("https://id.cisco.com/signin/register");
	}
@Test
public void Log() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Registration_Objects Reg= new Registration_Objects(driver);
		Reg.EmailId().sendKeys("wepadisej@vomoto.com");
		Reg.Password().sendKeys("Cisco@123");
		Reg.FirstName().sendKeys("SHan");
		Reg.LastName().sendKeys("kar");
		
		//Thread.sleep(5000);
//		WebDriverWait t = new WebDriverWait(driver, 10); 
//		t.until(ExpectedConditions.presenceOfElementLocated((By) Reg.Country())); 
		Reg.Select().click();
		Reg.Country().sendKeys("India");
		Thread.sleep(5000);
	List <WebElement> Countries=	driver.findElements(By.xpath("//body/div[@id='input355_chzn']/div[1]/ul[1]"));	
	
	    for( WebElement Coun try : Countries) {
	    	if(Country.getText().equalsIgnoreCase("India")) {
	    		Country.click();
	    		break;
	    	}
	    }
	//  driver.close();
	}


}

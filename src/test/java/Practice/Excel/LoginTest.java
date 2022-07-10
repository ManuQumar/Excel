package Practice.Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.excel.Xls_Reader;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.Chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		//driver.get("https://www.facebook.com/");
		ChromeOptions C= new ChromeOptions();
		
		C.addArguments("--disable-notifications");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Xls_Reader reader = new Xls_Reader("C:\\Users\\PC\\Desktop\\DummyData.xlsx");
		 String sheetName ="Data";
		 int rowCount=	reader.getRowCount(sheetName);
		 for( int rowNum=2; rowNum<=rowCount; rowNum++) {
			 String LogIn_id=	reader.getCellData(sheetName, "Login", rowNum);
			 	String Password = reader.getCellData(sheetName, 1, rowNum);
			 WebElement UserName=	driver.findElement(By.name("username"));
			 WebElement Pswrd=	driver.findElement(By.name("password"));
			 WebElement LogIn=	driver.findElement(By.className("btn-small"));
//				 WebElement UserName=	driver.findElement(By.name("email"));
//				 WebElement Pswrd=	driver.findElement(By.name("pass"));
//				 WebElement LogIn=	driver.findElement(By.name("login"));
			 UserName.clear();
			 UserName.sendKeys(LogIn_id);
			 Pswrd.clear();
			 Pswrd.sendKeys(Password);
			 LogIn.click();
			 	System.out.println(LogIn_id + " " + Password);
		 }
	}

}

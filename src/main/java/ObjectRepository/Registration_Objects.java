package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration_Objects {
	WebDriver driver;
	public Registration_Objects(WebDriver driver) {
		this.driver= driver;
	}

	 By Email = By.name("email");
	By Password = By.name("password");
	By FirstName = By.name("coiFirstName");
	By LastName = By.name("coiLastName");
	By Select = By.xpath("//span[contains(@data-i18n,\"COUNTRY_SELECT\")]");
	By Country = By.xpath("//body/div[@id='input355_chzn']/div[1]/div[1]/input[1]");
	By RegisterButton= By.className("button-primary");


public WebElement EmailId() {
	return driver.findElement(Email);
}
public WebElement Password() {
	return driver.findElement(Password);
}
public WebElement FirstName() {
	return driver.findElement(FirstName);
}
public WebElement LastName() {
	return driver.findElement(LastName);
}
public WebElement Select() {
	return driver.findElement(Select);
}
public WebElement Country() {
	return driver.findElement(Country);
}
public WebElement RegisterButton() {
	return driver.findElement(RegisterButton);
}

}
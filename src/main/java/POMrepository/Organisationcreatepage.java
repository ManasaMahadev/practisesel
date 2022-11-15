package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organisationcreatepage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement productaddbutton;

	public Organisationcreatepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getProductaddbutton() {
		return productaddbutton;
	}
	
	
	
	

}

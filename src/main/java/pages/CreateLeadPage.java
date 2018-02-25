package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCmpyName;
	
	public CreateLeadPage enterCmpyName(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(eleCmpyName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFname;
	
	public CreateLeadPage enterFname(String data) {
		//WebElement elePassword = locateElement("password");
		type(eleFname, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLname;
	
	public CreateLeadPage enterLname(String data) {
		//WebElement elePassword = locateElement("password");
		type(eleLname, data);
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadBut;
	
	public ViewLeadPage clickCreateLeadBut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleCreateLeadBut);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new ViewLeadPage();
		
	}
	
		

}

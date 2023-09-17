package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Loginpage {
	
	
	@FindBy (xpath="//*[@id=\"pop\"]/div/section/button")
	WebElement Pub ;

	@FindBy (xpath="//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")
    WebElement Seconnecter1 ;
	
	@FindBy (xpath="//*[@id=\"dpdw-login-box\"]/div/div/a")
	WebElement Seconnecter2 ;
	
	@FindBy(xpath="//*[@id=\"input_identifierValue\"]")
	WebElement Email;
	
	@FindBy(xpath="/html/body/div/div[4]/form/div/div[3]/div[2]/button/span[3]")
	WebElement Continuer;
	
	@FindBy(xpath="//*[@id=\"passwordForm\"]/div/div[3]/label/input")
	WebElement Motdepasse;
	
	@FindBy(xpath="//*[@id=\"loginButton\"]")
	WebElement Seconnecter;
	
	@FindBy(xpath="//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")
	WebElement VerifLogin;
	
	public Loginpage(){
		PageFactory.initElements(Config.driver, this);
	}
	
	public void Connexion1() {
		Config.attente(5);
		Config.actions = new Actions (Config.driver);
		Config.actions.moveToElement(Pub).perform();
		Pub.click();
		Seconnecter1.click();
	}
	public void Connexion2() {
		Config.attente(2);
		Seconnecter2.click();
	}
	public void Email(String mail) {
		Config.attente(5);
		Email.sendKeys(mail);
		Continuer.click();
	}
	public void Motdepasse(String Mdp) {
		Config.attente(5);
		Motdepasse.sendKeys(Mdp);
		Seconnecter.click();
	}
	public String Verif() {
		String ActuelMessage = VerifLogin.getText();
		return ActuelMessage;
	}
}


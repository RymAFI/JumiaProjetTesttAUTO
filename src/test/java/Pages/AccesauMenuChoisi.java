package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AccesauMenuChoisi {

		@FindBy (xpath="//*[@id=\"jm\"]/div[3]/button")
		WebElement Pub2 ;
		
		@FindBy (xpath="//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/a[1]/span")
		WebElement Telephone_Tablette ;
		
		@FindBy (xpath="//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/div[1]/div/div[2]/div/a[2]")
		WebElement Smartwatch ;

		public AccesauMenuChoisi(){
			PageFactory.initElements(Config.driver, this);
		}
		
	public void AccesTelephone_Tablette () {
		Config.actions = new Actions (Config.driver);
		Config.actions.moveToElement(Pub2).perform();
		Pub2.click();
		Config.actions = new Actions (Config.driver);
		Config.actions.moveToElement(Telephone_Tablette).perform();
	}
	public void AccesSmartwachs () {	
		Config.attente(5);
		Config.actions = new Actions (Config.driver);
		Config.actions.moveToElement(Smartwatch).perform();
		Smartwatch.click();
		Config.actions = new Actions (Config.driver);
		
	}
}

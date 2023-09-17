package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class AchatProduitpage {
	@FindBy (xpath="//*[@id=\"pop\"]/div/section/button")
	WebElement Pub ;

	@FindBy (xpath="//*[@id=\"jm\"]/div[3]/button")
	WebElement Pub2 ;
	
	@FindBy (xpath="//*[@id=\"jm\"]/main/div[2]/div[3]/section/div[1]/article[1]")
	WebElement Smartwatch ;
	
	@FindBy (xpath="//*[@id=\"add-to-cart\"]/button")
	WebElement Acheter ;
	WebDriver driver;
	
	@FindBy (xpath="/html/body/div[1]/header/section/div[2]/a")
	WebElement Panier ;
	
	
	@FindBy (xpath="//*[@id=\"jm\"]/main/div/div[1]/article/article/a/div[2]/h3")
	WebElement VerifProduit;
	public AchatProduitpage(){
		PageFactory.initElements(Config.driver, this);
	}
	

public void AccesProduitChoisi () throws InterruptedException {	

	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"jm\\\"]/main/div[2]/div[3]/section/div[1]/article[2]/a/div[2]/h3/text()")));
	//for(WebElement produit: MenuSmartwatch) {
		//if (produit.getText().contains(menusmartwatch)) {
			//Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//Config.actions = new Actions (Config.driver);
			//Config.actions.moveToElement(produit).perform();
			//Config.actions.moveToElement(produit).click();
			//break;}
			Config.attente(5);
			Config.DeleteCookies();
			String scroll = "window.scrollTo(0,600);";
			((JavascriptExecutor) Config.driver).executeScript(scroll);
		
    //Config.actions = new Actions (Config.driver);
	//Config.actions.scrollToElement(Smartwatch).build().perform();
	Smartwatch.click();
	Thread.sleep(3000);
}
public void AchatSmartwatch () throws InterruptedException {	
	Pub.click();
	Pub2.click();
	Config.actions = new Actions (Config.driver);
	WebDriverWait wait2 = new WebDriverWait(Config.driver, Duration.ofSeconds(15));
	wait2.until(ExpectedConditions.elementToBeClickable(Acheter));
	Config.actions.moveToElement(Acheter).perform();
	Acheter.click();	
	Thread.sleep(3000);
}
public void Verifierlepanier () {	
	WebDriverWait wait2 = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
	wait2.until(ExpectedConditions.elementToBeClickable(Panier));
	
	Config.actions = new Actions (Config.driver);
	Config.actions.moveToElement(Panier).perform();
	Panier.click();
	Config.attente(5);
	String Produitachete = VerifProduit.getText();
	String ExceptedMessage = "Mibro Smart Watch Lite 2 - Tarnish - Garantie 1 an";
	Assert.assertEquals(ExceptedMessage, Produitachete);
	
}}

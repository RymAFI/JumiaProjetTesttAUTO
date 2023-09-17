package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Homepage {
	@FindBy (xpath="//*[@id=\"jm\"]/div[3]/button")
	WebElement Pub2 ;
	@FindBy (xpath="//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/a/span")
	List<WebElement> menus;
		
	public Homepage(){
			PageFactory.initElements(Config.driver, this);
		}
		
	public void Accesaumenu(String menu_nom) throws InterruptedException {
		
		Config.actions = new Actions (Config.driver);
		Config.actions.moveToElement(Pub2).perform();
		Pub2.click();
		for(WebElement Menu: menus) {
			if (Menu.getText().contains(menu_nom)) {
				Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				Config.actions = new Actions (Config.driver);
				Config.actions.moveToElement(Menu).perform();
				Thread.sleep(3000);
				Config.actions.moveToElement(Menu).click();
				break;
	}}
	}}



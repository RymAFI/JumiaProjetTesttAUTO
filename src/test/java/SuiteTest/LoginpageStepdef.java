package SuiteTest;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.Loginpage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class LoginpageStepdef {
	@Before
	public void init() {
		Config.ConfigChrome();
		Config.driver= new ChromeDriver();
		Config.maximwindo();
	}
	@Then("administrateur redirige vers la page Accueil contient le message {string}")
public void administrateur_redirige_vers_la_page_accueil_contient_le_message(String ExceptedMessage) {
	Loginpage login =new Loginpage();
	String ActuelMessage = login.Verif();
	Assert.assertEquals(ExceptedMessage, ActuelMessage);
}
}

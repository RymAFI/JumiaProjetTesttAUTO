package SuiteTest;

import Helper.Config;
import Pages.Homepage;
import io.cucumber.java.en.*;

public class HomepageStepdef {
	@When("administrateur clique sur le menu{string}")
	public void administrateur_clique_sur_le_menu(String menu) throws InterruptedException {
			
		    Homepage home = new Homepage();
		    home.Accesaumenu(menu);
		}
	
	@Then("la page de menu est affichee")
	public void la_page_de_menu_est_affichee() throws InterruptedException {
 
		    Thread.sleep(3000);
		    Config.driver.quit();
	}


}

package SuiteTest;

import Helper.Config;
import Pages.AccesauMenuChoisi;
import Pages.Loginpage;

import io.cucumber.java.en.Given;



public class CommunStepdef {
	

	@Given("administrateur est sur la page Accueil")
	public void administrateur_est_sur_la_page_accueil() {
		Config.driver.get("https://www.jumia.com.tn/");
	}
	@Given("Cliquer sur Se connecter1 au niveau de la barre de navigation")
	public void cliquer_sur_se_connecter1_au_niveau_de_la_barre_de_navigation() {
	 Loginpage connexionetape1 =new Loginpage();
	 connexionetape1.Connexion1();
	}

	@Given("Cliquer sur le button Se connecter2")
	public void cliquer_sur_le_button_se_connecter2() {
		Loginpage connexionetape2 =new Loginpage();
		connexionetape2.Connexion2(); 
	}

	@Given("administrateur a tape son Email valide {string}")
	public void administrateur_a_tape_son_email_valide(String mail) {
		Loginpage email = new Loginpage();
		email.Email(mail);
	}

	@Given ("administrateur a tape son mot de passe valide {string}")
	public void administrateur_a_tape_son_mot_de_passe_valide(String Mdp)  {
		Loginpage MDP = new Loginpage();
	    MDP.Motdepasse(Mdp);
	}
	@Given ("administrateur clique sur le menu choisi")
	public void administrateur_clique_sur_le_menu_choisi() {
	    AccesauMenuChoisi categorie = new AccesauMenuChoisi();
	    categorie.AccesTelephone_Tablette();
	    AccesauMenuChoisi menu = new AccesauMenuChoisi();
	    menu.AccesSmartwachs();
	}

}
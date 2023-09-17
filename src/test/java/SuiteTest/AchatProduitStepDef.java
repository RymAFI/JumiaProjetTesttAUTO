package SuiteTest;


import Pages.AchatProduitpage;
import io.cucumber.java.en.*;

public class AchatProduitStepDef {
	@When("administrateur clique sur le produit choisi")
	public void administrateur_clique_sur_le_produit_choisi() throws InterruptedException {
	    AchatProduitpage choix = new AchatProduitpage();
	choix.AccesProduitChoisi();
	}

	@When("administrateur clique sur le bouton Acheter")
	public void administrateur_clique_sur_le_bouton_acheter() throws InterruptedException {
		AchatProduitpage achat = new AchatProduitpage();
		achat.AchatSmartwatch();
	}

	@Then("le produit est ajoute au panier")
	public void le_produit_est_ajoute_au_panier() throws InterruptedException {
		AchatProduitpage Produit = new AchatProduitpage();
		Produit.Verifierlepanier();
		
		
	}


}

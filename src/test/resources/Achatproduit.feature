#Author: RymAFI
Feature: Achat Produit

  Background: 
    Given administrateur est sur la page Accueil
    And Cliquer sur Se connecter1 au niveau de la barre de navigation
    And Cliquer sur le button Se connecter2
    And administrateur a tape son Email valide "afi.rym@gmail.com"
    And administrateur a tape son mot de passe valide "R!m5689##"
    And administrateur clique sur le menu choisi 

  Scenario: Acheter un produit
  
    When administrateur clique sur le produit choisi
    And administrateur clique sur le bouton Acheter
    Then le produit est ajoute au panier

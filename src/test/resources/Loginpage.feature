#Author: RymAFI
Feature: Connexion
Background: 
  
    Given administrateur est sur la page Accueil
    
Scenario: Connexion 
    When Cliquer sur Se connecter1 au niveau de la barre de navigation
    And Cliquer sur le button Se connecter2 
    And administrateur a tape son Email valide "afi.rym@gmail.com"
    And administrateur a tape son mot de passe valide "R!m5689##"
    Then administrateur redirige vers la page Accueil contient le message "Bonjour, Rym"
    
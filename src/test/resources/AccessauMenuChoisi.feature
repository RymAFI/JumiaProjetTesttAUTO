#Author: RymAFI
Feature: Acces au menu choisi

  Background: 
    Given administrateur est sur la page Accueil
    And Cliquer sur Se connecter1 au niveau de la barre de navigation
    And Cliquer sur le button Se connecter2
    And administrateur a tape son Email valide "afi.rym@gmail.com"
    And administrateur a tape son mot de passe valide "R!m5689##"

  Scenario: Accéder au menu choisi
    When administrateur clique sur le menu choisi 
    Then la page du menu choisi est affichee

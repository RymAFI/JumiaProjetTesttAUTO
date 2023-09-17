#Author: RymAFI
Feature: Consultation des menus

  Background: 
    Given administrateur est sur la page Accueil
    And Cliquer sur Se connecter1 au niveau de la barre de navigation
    And Cliquer sur le button Se connecter2
    And administrateur a tape son Email valide "afi.rym@gmail.com"
    And administrateur a tape son mot de passe valide "R!m5689##"

  Scenario Outline: Accéder aux menus de la page Home
    When administrateur clique sur le menu "<Téléphone & Tablette>"
    Then la page de menu est affichee

    Examples: 
      | Téléphone & Tablette     |
      | Cuisine & Électroménager |
      | Santé & Beauté           |
      | Électroniques            |
      | Superette                |
      | Mode                     |
      | Maison & Bureau          |
      | Informatique             |
      | Jeux vidéos & Consoles   |
      | Articles de sport        |
      | Jardin & Plein air       |
      | Autres catégories        |
      | Téléphone & Tablette     |

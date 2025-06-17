#Author: Sihem
Feature: HomePage Mabrouk

  Scenario: Select product from Home page
    Given Admin is on Home page
    When Admin mousehover on menu "Femme" and click on submenu "Chemises & Blouses"
    Then Admin is directed to "Chemises & Blouses" page

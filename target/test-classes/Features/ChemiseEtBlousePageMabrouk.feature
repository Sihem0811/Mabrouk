#Author: Sihem
Feature: ChemiseEtBlousePage Mabrouk

  Scenario: Select product from page "Chemises & Blouses"
    Given Admin is on "Chemises & Blouses" page
    When Admin click on product "CHEMISE JELIORA"
    Then Admin is directed to the product page "CHEMISE JELIORA"

#Author: Sihem
Feature: Feature: Product ChemiseEtBlousePage Mabrouk

  Scenario: Add product to the Shopping Cart
    Given Admin is on ChemisesEtBlouses page
    When Admin clicks on add to Shopping Cart
    Then The product "CHEMISE JELIORA" was added to the Shopping Cart

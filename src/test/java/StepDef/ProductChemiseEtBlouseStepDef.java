package StepDef;

import Helper.Config;
import Helper.Utils;
import Pages.ProductChemiseEtBlousePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductChemiseEtBlouseStepDef {

	@Given("Admin is on ChemisesEtBlouses page")
	public void admin_is_on_chemises_et_blouses_page() throws Exception {

		Config.confchrome();
		Config.maximizeWindow();
		Config.driver.get(Utils.getproprety("url3"));

	}

	@When("Admin clicks on add to Shopping Cart")
	public void admin_clicks_on_add_to_shopping_cart() throws InterruptedException {

		ProductChemiseEtBlousePage p = new ProductChemiseEtBlousePage();
		p.addProductToCart();

	}

	@Then("The product {string} was added to the Shopping Cart")
	public void the_product_was_added_to_the_shopping_cart(String verifName) {

		ProductChemiseEtBlousePage p = new ProductChemiseEtBlousePage();
		p.verifAddProduct(verifName);


	}




}

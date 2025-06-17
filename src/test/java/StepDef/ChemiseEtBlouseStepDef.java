package StepDef;

import Helper.Config;
import Helper.Utils;
import Pages.ChemiseEtBlousePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChemiseEtBlouseStepDef {
	
	@Given("Admin is on {string} page")
	public void admin_is_on_page(String productList) throws Exception {
		Config.confchrome();
		Config.maximizeWindow();
		Config.driver.get(Utils.getproprety("url2"));
	    
	}

	@When("Admin click on product {string}")
	public void admin_click_on_product(String product) throws InterruptedException {
		
		ChemiseEtBlousePage p = new ChemiseEtBlousePage();
		p.clickOnProductByName(product);
	
				

	}

	@Then("Admin is directed to the product page {string}")
	public void admin_is_directed_to_the_product_page(String product) {
		
		ChemiseEtBlousePage p = new ChemiseEtBlousePage();
		p.verifyproduct(product);
	  
	}




}

package StepDef;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	@Given("Admin is on Home page")
	public void admin_is_on_home_page() throws Exception {
		Config.confchrome();
		Config.maximizeWindow();
		Config.driver.get(Utils.getproprety("url1"));
	}

	@When("Admin mousehover on menu {string} and click on submenu {string}")
	public void admin_mousehover_on_menu_and_click_on_submenu(String menuTitle, String submenuTitle) throws InterruptedException {
		HomePage page =new HomePage();
		page.mouseHoverOnmenu(menuTitle, submenuTitle);

	}


	@Then("Admin is directed to {string} page")
	public void admin_is_directed_to_page(String submenuTitle) {
		HomePage page = new HomePage();
		page.verifPAGE(submenuTitle);


	}




}

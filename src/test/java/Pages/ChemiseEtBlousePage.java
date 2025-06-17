package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ChemiseEtBlousePage {


	@FindBy(xpath="/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li/div/div[2]/h3/a")
	List<WebElement> productList;

	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/h1")
	WebElement verifProduct;


	@FindBy(xpath=" /html/body/div[12]/div/div[2]/div/div/div/div/div/button")
	WebElement btnClosePopup1;


	@FindBy(xpath="	/html/body/div[5]/div[4]/div[4]/div/div[4]/div/ul/li[2]/div/div[2]/h3/a")
	WebElement itemChemiseJeliora;



	public ChemiseEtBlousePage () {
		PageFactory.initElements(Config.driver, this);
	}

	public void clickOnProductByName(String productname) throws InterruptedException{

		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnClosePopup1));

		btnClosePopup1.click();
		WebDriverWait waitt = new WebDriverWait(Config.driver, Duration.ofSeconds(10));

		waitt.until(ExpectedConditions.visibilityOf(itemChemiseJeliora));
		waitt.until(ExpectedConditions.elementToBeClickable(itemChemiseJeliora));

		itemChemiseJeliora.click();


		try {
			for(WebElement product: productList) {
				if(product.getText().contains(productname))
					product.click();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void verifyproduct(String nomproduct) {

		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(verifProduct));

		Assert.assertEquals(nomproduct, verifProduct.getText());
	}
}

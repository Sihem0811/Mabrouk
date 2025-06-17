package Pages;

import java.time.Duration;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ProductChemiseEtBlousePage {

	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[2]/div[3]/span[1]")
	WebElement size;


	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[1]/div[3]/div[3]/span[2]")
	WebElement color;


	@FindBy(xpath="/html/body/div[5]/div[4]/div[2]/div/div[1]/div[2]/div[2]/div/div[2]/div/div/form/div[2]/div[2]/a")
	WebElement btnAjoutPanier;


	@FindBy(xpath="/html/body/div[5]/header/div/div[1]/ul[2]/li[3]/div[1]/div[2]/div/p[2]/a[1]")
	WebElement btnVoirPanier;

	@FindBy(xpath="/html/body/div[4]/div[4]/div[4]/div/div/main/article/div/div/div[2]/div/form/div[1]/div/div[2]/div[1]/div/a")
	WebElement VerifProduct;


	@FindBy(xpath="/html/body/div[12]/div/div[2]/div/div/div/div/div/button")
	WebElement btnClosePopup2;


	public ProductChemiseEtBlousePage(){

		PageFactory.initElements(Config.driver,this);;

	}

	public void addProductToCart() throws InterruptedException{

		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnClosePopup2));

		btnClosePopup2.click();
		WebDriverWait waitt = new WebDriverWait(Config.driver, Duration.ofSeconds(10));

		waitt.until(ExpectedConditions.visibilityOf(size));
		waitt.until(ExpectedConditions.elementToBeClickable(size));

		size.click();

		Thread.sleep(5000);

		color.click();

		Thread.sleep(5000);

		btnAjoutPanier.click();

		Thread.sleep(5000);

		btnVoirPanier.click();
	}

	public void verifAddProduct(String productName){

		Config.attente(10);
		
		Assert.assertTrue(VerifProduct.getText().startsWith(productName));

		//Assert.assertEquals(productName, VerifProduct.getText());

	}
}

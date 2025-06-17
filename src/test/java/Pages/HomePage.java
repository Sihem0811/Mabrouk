package Pages;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class HomePage {

	@FindBy(xpath="/html/body/div[5]/header/div/div[3]/nav/div/div[3]/div[1]/ul/li/a/span")
	List<WebElement> menus;

	@FindBy(xpath="/html/body/div[5]/header/div/div[3]/nav/div/div[3]/div[1]/ul/li[4]/div/ul/li/a/span")
	List<WebElement> submenus;

	@FindBy(xpath="	/html/body/div[5]/div[4]/div[2]/div[2]/div/h1")
	WebElement verifPage;

	@FindBy(xpath="/html/body/div[11]/div/div[2]/div/div/div/div/div/button")
	WebElement btnClosePopup;

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/div/main/article/div/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div/div[3]/div/div/div[1]/div/div[1]")
	WebElement btnJeDecouvre;


	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}

	public void mouseHoverOnmenu(String menuTitle, String submenuTitle) throws InterruptedException {


		try {

			WebDriverWait wait = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(btnClosePopup));

			btnClosePopup.click();

			WebDriverWait waitt = new WebDriverWait(Config.driver, Duration.ofSeconds(10));
			waitt.until(ExpectedConditions.elementToBeClickable(btnJeDecouvre));

			btnJeDecouvre.click();

			Thread.sleep(5000);

			for(WebElement menu: menus) {
				if(menu.getText().contains(menuTitle)) {
					Actions actions = new Actions(Config.driver);
					actions.moveToElement(menu).perform();


					for(WebElement submenu: submenus) {
						if(submenu.getText().contains(submenuTitle)) {
							submenu.click();
						}
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception

		}
	}
	public void verifPAGE(String verifTitle) {
		Config.attente(10);
		Assert.assertEquals(verifTitle,  verifPage.getText());
	}
}

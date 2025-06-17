package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	
	public static WebDriver driver;
	public static void confchrome() {
		driver = new ChromeDriver();
	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}
	public static void attente(int s){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));

	}
}





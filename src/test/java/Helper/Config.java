package Helper;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class Config {
	public static Actions actions;
	public static WebDriver driver;
	public static void ConfigChrome() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	}
	public static void maximwindo() {
		driver.manage().window().maximize();}
public static void attente(long s) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
}

public static void DeleteCookies() throws InterruptedException
{

driver.manage().deleteAllCookies();; //delete all cookies
Thread.sleep(7000); //wait 7 seconds to clear cookies.
}

}

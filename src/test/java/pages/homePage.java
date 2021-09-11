package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	
	WebDriver driver;
	
	private By lb_alojamiento = By.xpath("//*[@id=\'b2indexPage\']/header/nav[2]/ul/li[1]/a");
	private By txt_AdondeVas = By.name("ss");
	private By txt_fechas = By.xpath("//*[@id=\'frm\']/div[1]/div[2]/div[1]/div[3]/div/div/div/div/span");
	private By txt_personas = By.className("xp__guests__count");
	private By btn_search = By.xpath("//*[@id=\'frm\']/div[1]/div[4]/div[2]/button");
	
	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAlojamiento() {
		driver.findElement(lb_alojamiento).click();
	}
	
	public void datosIniciales() {
		driver.findElement(txt_AdondeVas).sendKeys("San Andrés, Islas San Andrés y Providencia, Colombia");
	}
}

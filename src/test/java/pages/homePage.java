package pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	
	WebDriver driver;
	
	private By lb_alojamiento = By.xpath("//*[@id=\'b2indexPage\']/header/nav[2]/ul/li[1]/a");
	private By txt_AdondeVas = By.name("ss");
	private By txt_fechas = By.xpath("//*[@id=\'frm\']/div[1]/div[2]/div[1]/div[3]/div/div/div/div/span");
	private By txt_personas = By.className("xp__guests__count");
	private By btn_search = By.xpath("//*[@id=\'frm\']/div[1]/div[4]/div[2]/button");
	private By initialDate = By.xpath("//*[@id=\'frm\']/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[5]");
	private By endDate = By.xpath("//*[@id=\'frm\']/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[5]");
	private By addAdults = By.xpath("//*[@id=\'xp__guests__inputs-container\']/div/div/div[1]/div/div[2]/button[2]/span");
	//private By totalPeople = By.xpath("//*[@id=\'xp__guests__inputs-container\']/div/div/div[1]/div/div[2]/span[1]");
	
	public homePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickAlojamiento() {
		driver.findElement(lb_alojamiento).click();
	}
	
	public void datosIniciales(String ciudad) {
		driver.findElement(txt_AdondeVas).sendKeys(ciudad);
		driver.findElement(txt_fechas).click();
		driver.findElement(initialDate).click();
		driver.findElement(endDate).click();
		driver.findElement(txt_personas).click();
		//driver.findElement(addAdults).click();
		driver.findElement(addAdults).click();
		driver.findElement(btn_search).click();
	}

}

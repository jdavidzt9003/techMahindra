package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class alojamiento {
	
	WebDriver driver;
	
	private By lb_encontrados = By.xpath("//*[@id=\"right\"]/div[2]/div/div[1]/div/h1");
	private By btn_verDisponibilidad = By.xpath("/html/body/div[4]/div/div[4]/div[1]/div[1]/div[7]/div[5]/div[2]/div/div[5]/div[2]/div[3]/div/div/div/div[2]/div[2]/div/div/a/span");
	private By list_habitaciones = By.name("nr_rooms_32058207_302713223_1_1_0");
	private By lb_price = By.xpath("/html/body/div[2]/div/div[5]/div[1]/div[1]/div[13]/div[1]/div[5]/div[4]/table/tbody/tr/td[3]/table/tbody/tr[1]/td/div/div[2]/div/span");
	private By btn_reservare = By.xpath("//*[@id=\"b_tt_holder_2\"]");

	public alojamiento(WebDriver driver) {
		this.driver = driver;
	}
	
	public void separarAlojamiento() {
		//Assert.assertEquals("San Andrés", lb_encontrados);
		driver.findElement(btn_verDisponibilidad).click();
		driver.findElement(lb_price).getText();
		Alert alert = driver.switchTo().alert();
		//Thread.sleep(2000);
		alert.accept();
	}
}


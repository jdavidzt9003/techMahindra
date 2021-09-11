package pages;

import org.openqa.selenium.By;

public class alojamiento {
	private By lb_encontrados = By.xpath("//*[@id=\"right\"]/div[2]/div/div[1]/div/h1");
	private By btn_verDisponibilidad = By.className("bui-button__text js-sr-cta-text");
	private By list_habitaciones = By.name("nr_rooms_32058207_302713223_1_1_0");
	private By lb_price = By.xpath("//*[@id=\"hprt-form\"]/div[6]/div[2]/div[3]/div[2]/div/div[2]");
	private By btn_reservare = By.xpath("//*[@id=\"b_tt_holder_2\"]");
}

package stepDefinitions;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;

public class techMahindra_stepDefinition {
	

	WebDriver driver;
	
	@Given("En la pagina Booking seccion alojamiento")
	public void en_la_pagina_booking_seccion_alojamiento() {
		
		System.out.println("Inside Step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : " + projectPath);

		System.setProperty("webdriver.gecko.driver", projectPath + "/src/test/resources/driver/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://booking.com");
		
	
	}
	@When("Selecciona la opcion que se ajuste a su condiciones")
	public void selecciona_la_opcion_que_se_ajuste_a_su_condiciones() {
		homePage page = new homePage(driver);
		page.clickAlojamiento();
		page.datosIniciales("San Andrés, Islas San Andrés y Providencia, Colombia");
	    
	}
	@Then("La pagina le confirma la reserva")
	public void la_pagina_le_confirma_la_reserva() {
		driver.close();
	}

}

package stepDefinitions;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("La pagina le confirma la reserva")
	public void la_pagina_le_confirma_la_reserva() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}

}

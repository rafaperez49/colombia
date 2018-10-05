package elcolombiano.stepsdefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elcolombiano.model.Diligenciar;
import elcolombiano.model.UsuarioColombiano;
import elcolombiano.task.Ingresar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ElColombianoDefinition {
	
	@Managed(driver="chrome")
	private WebDriver suNavegador;
	
	private Actor rafa = Actor.named("Rafa");
	
	@Before
	public void configuracionPrevia()
	{
		rafa.can(BrowseTheWeb.with(suNavegador));
	}
	
	
	@Given("^Rafa quiere leer las noticias$")
	public void rafaQuiereLeerLasNoticias(){
		
		
		rafa.wasAbleTo(Ingresar.alColombiano());
		
	}


	@When("^Rafa se registra en la pagina de el colombiano$")
	public void rafaSeRegistraEnLaPaginaDeElColombiano(List<UsuarioColombiano> laTabla){
				
		rafa.attemptsTo(Diligenciar.elFormulario().con(laTabla));
		
	}

	@Then("^verifica que ingresó exitosamente viendo en pantalla (.*)$")
	public void verificaQueIngresóExitosamenteViendoEnPantalla(String mensajeBienvenida){
	}

}

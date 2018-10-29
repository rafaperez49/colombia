package elcolombiano.stepsdefinition;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elcolombiano.model.Diligenciar;
import elcolombiano.model.UsuarioColombiano;
import elcolombiano.task.Ingresar;
import net.serenitybdd.screenplay.actors.OnStage;

public class ElColombianoDefinition {
	

	@Given("^(.*) quiere leer las noticias$")
	public void rafaQuiereLeerLasNoticias(String rafa){	
		theActorCalled(rafa).wasAbleTo(Ingresar.alColombiano());	
	}
	
	@When("^(.*) se registra en la pagina de el colombiano$")
	public void rafaSeRegistraEnLaPaginaDeElColombiano(String rafa, List<UsuarioColombiano> laTabla){			
		//theActorCalled(rafa).attemptsTo(Diligenciar.elFormulario().con(laTabla));
		
		OnStage.theActorInTheSpotlight().attemptsTo(Diligenciar.elFormulario().con(laTabla));
	}

	@Then("^verifica que ingresó exitosamente viendo en pantalla (.*)$")
	public void verificaQueIngresóExitosamenteViendoEnPantalla(String mensajeBienvenida){
	}

}

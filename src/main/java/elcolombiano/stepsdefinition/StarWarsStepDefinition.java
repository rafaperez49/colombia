package elcolombiano.stepsdefinition;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static elcolombiano.model.StarWarsEndPoints.Personaje1;
import elcolombiano.questions.LaApi;
import elcolombiano.task.Consultar;

public class StarWarsStepDefinition {
	
	@Dado("^que (.*) quiere consulta por el personaje 1 de la API de Star Wars$")
	public void que_Rafael_quiere_consulta_por_el_personaje_de_la_API_de_Star_Wars(String rafa) {
	   theActorCalled(rafa).attemptsTo(Consultar.laAPi(Personaje1.getEndPoint()));
	}

	@Entonces("^verifica que el nombre sea (.*)$")
	public void verifica_que_el_nombre_sea_Luke_SkyWalker(String personaje) {
		theActorInTheSpotlight().should(seeThat(LaApi.trajoRespuesta(), equalTo(personaje)));		
	}
	
}

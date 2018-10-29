package elcolombiano.questions;

import elcolombiano.model.Personaje;
import elcolombiano.model.StarWarsHook;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaApi implements Question<String>{
	
	
	@Override
	public String answeredBy(Actor actor) {		
		String json = StarWarsHook.starWars.getBody().asString();
		return new JsonPath(json).getObject("$", Personaje.class).getNombre();
	}

	public static LaApi trajoRespuesta() {
		return new LaApi();
	}

}

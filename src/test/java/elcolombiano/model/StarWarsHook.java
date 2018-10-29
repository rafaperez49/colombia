package elcolombiano.model;

import cucumber.api.java.Before;
import io.restassured.response.Response;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StarWarsHook {
	
	public static Response starWars;
	
	@Before
	public void setup()
	{ OnStage.setTheStage(new OnlineCast());
	}

}

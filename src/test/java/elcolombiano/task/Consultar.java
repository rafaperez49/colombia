package elcolombiano.task;

import elcolombiano.model.StarWarsHook;
import io.restassured.RestAssured;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Consultar implements Task{
	
	public String starWarsLink;
	
	public Consultar(String starWarsLink) {
		this.starWarsLink = starWarsLink;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		StarWarsHook.starWars=RestAssured.get(starWarsLink).andReturn();
	}

	public static Consultar laAPi(String starwarsLink) {
		return Tasks.instrumented(Consultar.class, starwarsLink);
	}

}

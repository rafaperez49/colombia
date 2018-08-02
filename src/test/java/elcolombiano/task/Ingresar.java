package elcolombiano.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import elcolombiano.ui.ElColombianoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Ingresar implements Task{

	ElColombianoPage elColombianoPage;
	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(Open.browserOn(elColombianoPage));
	}
	public static Ingresar alColombiano() {
		
		return instrumented(Ingresar.class);
	}
	
	

}

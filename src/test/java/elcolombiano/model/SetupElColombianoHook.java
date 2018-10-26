package elcolombiano.model;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetupElColombianoHook {
	
	@Before
	public void setup(){
		
		OnStage.setTheStage(new OnlineCast());
	}
}

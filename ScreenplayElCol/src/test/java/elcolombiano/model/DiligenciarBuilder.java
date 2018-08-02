package elcolombiano.model;

import java.util.List;

import elcolombiano.task.Diligenciamiento;
import net.serenitybdd.screenplay.Performable;

public class DiligenciarBuilder {
	
	

	public Diligenciamiento con(List<List<String>> laInformacionDeRegistro) {
		return new Diligenciamiento(laInformacionDeRegistro);
	}
	
	

}

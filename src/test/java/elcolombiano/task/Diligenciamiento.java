package elcolombiano.task;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;

import elcolombiano.exceptions.CampoNoVacioException;
import elcolombiano.model.Nombres;
import elcolombiano.model.UsuarioColombiano;
import elcolombiano.ui.ElColombianoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Diligenciamiento implements Task{

	private List<UsuarioColombiano> tablaInfo;
	
	
	public Diligenciamiento( List<UsuarioColombiano> tablaInfo) {
		this.tablaInfo = tablaInfo;
	}


	@Override
	public <T extends Actor> void performAs(T actor) {
		//actor.attemptsTo(Enter.theValue( tablaInfo.get(0).getEmail().trim() ).into(ElColombianoPage.EMAIL));
		
		actor.should(GivenWhenThen.seeThat(WebElementQuestion.the(ElColombianoPage.EMAIL), WebElementStateMatchers.containsText("Hola")).orComplainWith(CampoNoVacioException.class, "El campo debería estar vacío." ));
		
		actor.attemptsTo(Enter.theValue(Nombres.MARUJA.toString() ).into(ElColombianoPage.EMAIL));
		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).getConfirmar_email().trim() ).into(ElColombianoPage.CONFIRMACION_CORREO));
		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).getPassword().trim()  ).into(ElColombianoPage.PASSWORD));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(3).toString().trim()  ).into(ElColombianoPage.CONFIRMACION_PASSWORD));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(4).toString().trim()  ).into(ElColombianoPage.USUARIO));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(5).toString().trim()  ).into(ElColombianoPage.NOMBRES));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(6).toString().trim()  ).into(ElColombianoPage.APELLIDOS));
		actor.attemptsTo(Click.on(ElColombianoPage.TIPO_DOCUMENTO));
		actor.attemptsTo(WaitUntil.the(ElColombianoPage.BOTON_ACEPTAR, isVisible()).forNoMoreThan(10).seconds());
		
		//enumsPrueba(Nombres.MARUJA);
		
		
		
		
		
//		ElColombianoPage.TIPO_DOCUMENTO.resolveFor(actor).selectByVisibleText(tablaInfo.get(0).get(7).toString().trim());
//		//actor.attemptsTo(new SelectByVisibleTextFromTarget(ElColombianoPage.TIPO_DOCUMENTO, tablaInfo.get(0).get(7).toString().trim() ));
//		//actor.attemptsTo(SelectFromOptions.byVisibleText(tablaInfo.get(0).get(7).toString().trim()).from(ElColombianoPage.TIPO_DOCUMENTO));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(8).toString().trim()  ).into(ElColombianoPage.NUMERO_DOCUMENTO));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(9).toString().trim()  ).into(ElColombianoPage.FECHA_NACIMIENTO));
//		//actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(10).toString().trim()  ).into(ElColombianoPage.GENERO));
//		
		 actor.attemptsTo(Check.whether(tablaInfo.get(0).getGenero().toString().trim().equals("Masculino")).
				 andIfSo(Click.on(ElColombianoPage.GENERO_MASCULINO), 
						 Click.on(ElColombianoPage.GENERO_FEMENINO),
						 Click.on(ElColombianoPage.GENERO_MASCULINO)).
				 otherwise(Click.on(ElColombianoPage.GENERO_FEMENINO)));
		 
		 
		
		 
		 
		//actor.can(BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].click()",ElColombianoPage.GENERO_FEMENINO.resolveFor(actor) ));  
		
//		 
//		if(tablaInfo.get(0).getGenero().toString().trim().equals("Masculino"))
//			actor.attemptsTo(Click.on(ElColombianoPage.GENERO_MASCULINO));
//		else
//			actor.attemptsTo(Click.on(ElColombianoPage.GENERO_FEMENINO));
		
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(11).toString().trim()  ).into(ElColombianoPage.MOVIL));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(12).toString().trim()  ).into(ElColombianoPage.FIJO));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(13).toString().trim()  ).into(ElColombianoPage.DIRECCION));
//		actor.attemptsTo(SelectFromOptions.byVisibleText(tablaInfo.get(0).get(14).toString().trim()).from(ElColombianoPage.PAIS));
//		actor.attemptsTo(SelectFromOptions.byVisibleText(tablaInfo.get(0).get(15).toString().trim()).from(ElColombianoPage.EDUCACION));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(16).toString().trim()  ).into(ElColombianoPage.DEPARTAMENTO));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(17).toString().trim()  ).into(ElColombianoPage.OCUPACION));
//		actor.attemptsTo(Enter.theValue( tablaInfo.get(0).get(18).toString().trim()  ).into(ElColombianoPage.CIUDAD));
//		actor.attemptsTo(Click.on(ElColombianoPage.BOTON_ACEPTAR));
				
	}
	
	public void enumsPrueba(Nombres nombre)
	{
		System.out.println(nombre.name());
	}
	

}

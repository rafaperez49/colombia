package elcolombiano.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.elcolombiano.com/nuevos-usuarios")
public class ElColombianoPage extends PageObject{
	
	public static final Target EMAIL= Target.the("El email").located(By.name("615dd4a739c311e486d4005056943339"));
	public static final Target CONFIRMACION_CORREO = Target.the("confirmación del correo").located(By.id("615bb48739c311e486d4005056943339_615dd4a739c311e486d4005056943339_rep"));
	public static final Target PASSWORD = Target.the("El password").located(By.name("615dcdc039c311e486d4005056943339"));
	public static final Target CONFIRMACION_PASSWORD = Target.the("Confirmar password").located(By.id("615bb48739c311e486d4005056943339_615dcdc039c311e486d4005056943339_rep"));
	public static final Target USUARIO = Target.the("El usuario").located(By.name("615dabbf39c311e486d4005056943339"));
	
	public static final Target NOMBRES =Target.the("El nombre").located(By.name("c404f1e149bc11e4978a005056943339"));
	public static final Target APELLIDOS = Target.the("Los apellidos").located(By.name("fe27096349bc11e4978a005056943339"));
	public static final Target TIPO_DOCUMENTO = Target.the("Tipo Documento").located(By.name("e02132b549bf11e4978a005056943339"));
	public static final Target NUMERO_DOCUMENTO = Target.the("Numero documento").located(By.name("05ebe20849c011e4978a005056943339"));
	public static final Target FECHA_NACIMIENTO = Target.the("Tipo documento").located(By.id("615bb48739c311e486d4005056943339_2aef412c49c011e4978a005056943339"));
	
	public static final Target GENERO = Target.the("El género").located(By.className("radio_option"));
	public static final Target GENERO_MASCULINO = Target.the("El género").locatedBy("//*[@id=\'615bb48739c311e486d4005056943339_7379d69749c011e4978a005056943339\']");
	public static final Target GENERO_FEMENINO = Target.the("El género").locatedBy ("//input[@value='2']");
	public static final Target MOVIL = Target.the("El numero movil").located(By.name("b25e1a57612611e48843005056943339"));
	public static final Target FIJO = Target.the("El número fijo").located(By.name("ce2f570a612611e48843005056943339"));
	public static final Target DIRECCION = Target.the("La direcciópn").located(By.name("5d49dbe64a3c11e4978a005056943339"));
	
	public static final Target PAIS = Target.the("El país de residencia").located(By.name("201614644a4211e4978a005056943339"));
	public static final Target EDUCACION = Target.the("El nivel de educación").located(By.name("6637069d4a4211e4978a005056943339"));
	
	public static final Target DEPARTAMENTO = Target.the("El departamento").located(By.name("8965522e4a4211e4978a005056943339"));
	public static final Target OCUPACION = Target.the("La ocupación").located(By.name("a766fcb34a4211e4978a005056943339"));
	public static final Target CIUDAD = Target.the("La ciudad").located(By.name("bf9053f64a4211e4978a005056943339"));
	
	public static final Target BOTON_ACEPTAR =Target.the("elBotón que ejecuta el registro").locatedBy("//input[@value='Enviar ']");	
	
}

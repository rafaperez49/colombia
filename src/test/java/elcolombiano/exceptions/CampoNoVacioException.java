package elcolombiano.exceptions;


public class CampoNoVacioException extends AssertionError{
	
	public CampoNoVacioException(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}

}
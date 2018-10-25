package elcolombiano.model;

public enum Apellidos {
	
	PEREZ("Pérez");
	private String apellido;
	
	Apellidos(String apellido)
	{
		this.apellido=apellido;
	}
	
	public String getApellido()
	{
		return this.apellido;
	}

}

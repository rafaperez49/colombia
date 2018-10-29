package elcolombiano.model;

public enum StarWarsEndPoints {
	
	Personaje1("https://swapi.co/api/people/1/?format=json");
	
	private final String endPoint;
	
	StarWarsEndPoints(String endPoint)
	{
	this.endPoint=endPoint;	
	}

	public String getEndPoint() {
		return endPoint;
	}
	
	

}

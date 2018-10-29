package elcolombiano.model;

public enum Posicion {
	CERO(0),
	UNO(1);
	private int pos;
	
	Posicion(int pos)
	{
		this.pos=pos;
	}

	public int getPos() {
		return pos;
	}
	
	
}

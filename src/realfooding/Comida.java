package realfooding;

public abstract class Comida {

	protected int calorias;
	protected String nombre;
	
	public Comida(int calorias,String nombre) {
		
	this.calorias = calorias;	
	this.nombre = nombre;	

	}
	
	public abstract boolean saludable();
	public abstract String procedencia();
	
}

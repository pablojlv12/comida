package realfooding;

public class Verdura extends Comida {

	private boolean tuberculo;
	private boolean hojaVerde;
	
	public Verdura(int calorias, String nombre,
			        boolean tuberculo, boolean hojaVerde) {
		super(calorias, nombre);
        this.tuberculo = tuberculo;
        this.hojaVerde = hojaVerde;
	}

	@Override
	public boolean saludable() {
		return true;
	}

	@Override
	public String procedencia() {
		return nombre+ " vegano";
	
	}
}

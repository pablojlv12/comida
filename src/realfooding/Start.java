package realfooding;

public class Start {

	public static void main(String[] args) {
		
		Comida[] realFood = new Comida [10];

		realFood [0] = new Fruta (123, "Naranja", 23, false);
		realFood [1] = new Fruta (90, "Manzana", 40, false); 
		realFood [2] = new Fruta (32, "Pera", 65 , false);
		realFood [3] = new Fruta (542, "Pasa", 21 , true);
		realFood [4] = new Verdura (233, "Lechuga", false, true); 
		realFood [5] = new Verdura (52, "Brócoli", false, true);
		realFood [6] = new Verdura (85, "Patata", true, false);
		realFood [7] = new Carne (890, "Solomillo", false);
		realFood [8] = new Carne (1239, "Pechuga", false);
		realFood [9] = new Carne (890, "Ternera", true);
		
		for(Comida alimento : realFood) {
			System.out.println(alimento.procedencia());
			System.out.println(alimento.saludable());
			System.out.println("------------------");

		}
		
	}

}

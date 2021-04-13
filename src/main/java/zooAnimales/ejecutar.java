package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class ejecutar {

	public static void main(String[] args) {
		Zoologico zoo=new Zoologico();
		Mamifero an1 = new Mamifero("persona", 50, "ciudad", "F",false, 2);
		Animal a= new Animal();
		//System.out.println(an1.getHabitat());
		//an1.crearCaballo("Pony", 3, "f");
		Ave ave1 = new Ave();
		//Zona zona = new Zona();
	    Mamifero.crearCaballo("Pony", 3, "f");
		//System.out.println(Mamifero.cantidadMamiferos());
		//System.out.println(an1.getHabitat());
		Anfibio an2 = new Anfibio("rana", 5, "pradera", "F","verde", false);
		Zona zona = new Zona("dfgher",zoo );
		zona.agregarAnimales(Mamifero.crearCaballo("jsd", 3, "m"));
		System.out.println(zona.cantidadAnimales());
		//Mamifero.crearCaballo("Pony", 3, "f");
	
	}

}

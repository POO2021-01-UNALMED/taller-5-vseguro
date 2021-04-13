package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class ejecutar {

	public static void main(String[] args) {
		
		Mamifero an1 = new Mamifero("persona", 50, "ciudad", "F",false, 2);
		Ave ave1 = new Ave();
		Anfibio an2 = new Anfibio("rana", 5, "pradera", "F","verde", false);
		//System.out.println(an2.isVenenoso());
		//System.out.println(pez1.getNombre());
		//System.out.println(ave1.getNombre());
		//System.out.println(mamifero1.getNombre());
		//System.out.println(zona.cantidadAnimales());
		System.out.println(an1.getNombre());
	}

}

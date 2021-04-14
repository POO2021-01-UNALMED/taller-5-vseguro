package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class ejecutar {

	public static void main(String[] args) {
		Zoologico zoo=new Zoologico();
		Mamifero an1 = new Mamifero();
		System.out.println(an1.getPatas());
		Mamifero.crearCaballo("Pony",5,"f");
		System.out.println(an1.getNombre());
		
	
	
	}

}

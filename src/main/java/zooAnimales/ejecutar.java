package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class ejecutar {

	public static void main(String[] args) {
		/*Zoologico zoo=new Zoologico();
		Mamifero an1 = new Mamifero();
		System.out.println(an1.getPatas());
		Mamifero.crearCaballo("Pony",5,"f");
		System.out.println(an1.getNombre());*/
		/*Zoologico zoo = new Zoologico();

		Zona z1 = new Zona();
		Zona z2 = new Zona();
		zoo.agregarZonas(z1);
		zoo.agregarZonas(z2);
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearLeon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Anfibio.crearRana("test", 11, "M"));
		z2.agregarAnimales(Anfibio.crearSalamandra("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearIguana("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearSerpiente("test", 11, "M"));
		z2.agregarAnimales(Pez.crearSalmon("test", 11, "M"));
		z2.agregarAnimales(Pez.crearBacalao("test", 11, "M"));
		Mamifero.crearCaballo("test", 11, "M");
		Ave.crearHalcon("test", 11, "M");
		Anfibio.crearRana("test", 11, "M");
		Reptil.crearIguana("test", 11, "M");
		Pez.crearBacalao("test", 11, "M");
		System.out.println(zoo.cantidadTotalAnimales());*/
		Ave an2 = new Ave("paloma", 5, "ciudad", "F", "gris");
		boolean ok = false;
		String  comp = "Mi nombre es paloma, tengo una edad de 5, habito en ciudad y mi genero es F";
		System.out.println(an2.toString().equals(comp));
		System.out.println(an2.toString());
		




	}

}

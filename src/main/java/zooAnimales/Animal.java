package zooAnimales;
import gestion.*;

public class Animal {
	private  int totalAnimales;
	private String nombre;
	private static int edad;
	private  static String habitat;
	private static String genero;
	private Zona zona;
	
	static {
		int totalAnimales;
		String nombre;
	}
	
    public Animal(String nombre, int edad, String habitat, String genero) {
		//this.totalAnimales=totalAnimales;
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		//this.zona=zona;
		totalAnimales++;
	}
	
    public Animal() {
    	totalAnimales++;
    }
    
	public String movimiento() {
		return "desplazarse";

	}
	
	public static String totalPorTipo() {
		return ("Mamiferos: "+ Mamifero.cantidadMamiferos() + "\n"+
		"Aves: "+ Ave.cantidadAves() + "\n"+
		"Reptiles: " + Reptil.cantidadReptiles() + "\n" +
		"Peces: " + Pez.cantidadPeces() + "\n" +
		"Anfibios: " + Anfibio.cantidadAnfibios());

	}
	
	public String toString() {
		return "Mi nombre es" + nombre +", tengo una edad de"+ edad +
				", habito en" + habitat + "y mi genero es" + genero +
				", la zona en la que me ubico es " + zona + "en el zoo";
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public void setTotalAnimales(int totalAnimales) {
		this.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Animal.nombre = nombre; 
	}

	public int getEdad() {
		return edad;
	}

	public static void setEdad(int edad) {
		Animal.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public static void setHabitat(String habitat) {
		Animal.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public static void setGenero(String genero) {
		Animal.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	

}

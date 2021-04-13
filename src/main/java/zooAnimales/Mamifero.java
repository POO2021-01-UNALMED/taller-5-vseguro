package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private static boolean pelaje;
	private static int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje,int patas) {
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
	}
	public Mamifero() {}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public void crearCaballo(String nombre, int edad, String genero) {
		pelaje=true;
		patas=4;
		super.setHabitat("pradera");
        super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		caballos++;
		
	}
	
	public void crearLeon(String nombre, int edad, String genero) {
		pelaje=true;
		patas=4;
		super.setHabitat("selva");
        super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		leones++;
	}

	public ArrayList<Mamifero> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Mamifero> listado) {
		this.listado = listado;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void isPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	

}

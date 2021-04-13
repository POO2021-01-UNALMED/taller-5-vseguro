package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado =new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);;
		this.colorPlumas=colorPlumas;
	}
	
	public Ave() {}

	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		colorPlumas="cafe glorioso";
		setHabitat("montanas");
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		halcones++;	
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		colorPlumas= "blanco y amarillo";
		setHabitat("montanas");
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		aguilas++;
		
	}

	public ArrayList<Ave> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Ave> listado) {
		this.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	

}

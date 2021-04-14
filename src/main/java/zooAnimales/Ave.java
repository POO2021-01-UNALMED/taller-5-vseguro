package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado =new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public static int aves;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}
	
	public Ave() {
		aves++;
	}

	public static int cantidadAves() {
		return listado.size()+ aves;
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Animal crearHalcon(String nombre, int edad, String genero) {
		Ave av1= new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		return av1;
	}
	
	public static Animal crearAguila(String nombre, int edad, String genero) {
		Ave av1= new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return av1;		
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

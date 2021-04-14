package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int anfibios;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel,boolean venenoso) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
		
	}
	public Anfibio() {
		anfibios ++;
	}
	
	public static int cantidadAnfibios() {
		return listado.size() + anfibios;
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Animal crearRana(String nombre, int edad, String genero) {
		Anfibio anf1=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return anf1;
	}
	
	public static Animal crearSalamandra(String nombre, int edad, String genero) {
		Anfibio anf1=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return anf1;
	}

	public ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void isVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	

}

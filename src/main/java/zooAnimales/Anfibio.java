package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel,boolean venenoso) {
		super(nombre, edad, habitat,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		
	}
	public Anfibio() {}
	
	public int cantidadAnfibios() {
		return listado.size();
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		colorPiel="rojo";
		venenoso=true;
		setHabitat("selva");
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		ranas++;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		colorPiel="negro y amarillo";
		venenoso=false;
		setHabitat("selva");
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		salamandras++;
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

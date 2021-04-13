package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado=new ArrayList<Pez>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		
		
	}
	public Pez() {}
	
	public static int cantidadPeces() {
		return listado.size();
	}

	public String movimiento() {
		return "nadar";
	}

	public void crearSalmon(String nombre, int edad, String genero) {
		colorEscamas="rojo";
		cantidadAletas=6;
		setHabitat("oceano");
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		salmones++;
	
	}

	public void crearBacalao(String nombre, int edad, String genero) {
		colorEscamas="gris";
		cantidadAletas=6;
		setHabitat("oceano");
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		bacalaos++;
	}

	public ArrayList<Pez> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Pez> listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	

}

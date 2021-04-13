package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		
	}
	
	public Reptil() {}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
		colorEscamas="verde";
		largoCola=3;
		setHabitat("humedal");
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		iguanas++;
	}
	
	public void crearSerpiente(String nombre, int edad, String genero) {
		colorEscamas="blanco";
		largoCola=1;
		setHabitat("jungla");
		setNombre(nombre);
		setEdad(edad);
		setGenero(genero);
		serpientes++;
	}

	public ArrayList<Reptil> getListado() {
		return listado;
	}

	public void setListado(ArrayList<Reptil> listado) {
		this.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	

}

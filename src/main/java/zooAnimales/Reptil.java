package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public static int reptiles;
	
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas, int largoCola) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
		
	}
	
	public Reptil() {
		reptiles++;
	}
	
	public static int cantidadReptiles() {
		return listado.size()+reptiles;
	}
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Animal crearIguana(String nombre, int edad, String genero) {
		Reptil rep1 = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
		return rep1;
	}
	
	public static Animal crearSerpiente(String nombre, int edad, String genero) {
		Reptil rep1 = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
		return rep1;
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

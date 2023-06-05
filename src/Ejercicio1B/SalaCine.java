package Ejercicio1B;

public class SalaCine {
	
	private String nombre;
	private int capacidad;
	private int numPersonas;
	
	SalaCine(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		numPersonas = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}
	
	public boolean hayHueco() {
		return (capacidad != 0);
	}
	
	public boolean hayPersona() {
		return (numPersonas != 0);
	}
	
	public void MetePersona() {
		System.out.println(this.toString());
		capacidad--;
		numPersonas++;
	}
	
	public void SacaPersona() {
		System.out.println(this.toString());
		capacidad++;
		numPersonas--;
	}

	@Override
	public String toString() {
		return "SalaCine [nombre=" + nombre + ", capacidad=" + capacidad + ", numPersonas=" + numPersonas + "]";
	}

}

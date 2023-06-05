package Ejercicio5B;

import java.util.Random;

abstract public class Ciclista {
	
	protected int identificador;
	protected String nombre;
	protected double tiempoAcumulado = 0;
	protected int posicionGeneral = 0;
	
	public Ciclista(int identificador, String nombre) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
	}

	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTiempoAcumulado() {
		return tiempoAcumulado;
	}
	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	public int getPosicionGeneral() {
		return posicionGeneral;
	}
	public void setPosicionGeneral(int posicionGeneral) {
		this.posicionGeneral = posicionGeneral;
	}

	@Override
	public String toString() {
		return "Ciclista [identificador=" + getIdentificador() + ", nombre=" + getNombre() + ", tiempoAcumulado="
				+ getTiempoAcumulado() + ", posicionGeneral=" + getPosicionGeneral() +  "]";
	}
	
	abstract public String imprimirTipo();
	
	public int generateRandom() {
		Random r = new Random();
		return 8 + r.nextInt(25);
	}
	
	public void calcularTiempoParcial() {
		 int random = generateRandom();
		 this.tiempoAcumulado += random;
	}

}

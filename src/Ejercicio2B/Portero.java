package Ejercicio2B;

public class Portero extends Jugador{
	private int golesRecibidos;
	private int penaltisParados;
	
	public Portero() {
		
	}

	public Portero(String n, String d, int p, int g, int a, int r,
			int gr, int pp) {
		super(n, d, p, g, a, r);
		this.golesRecibidos = gr;
		this.penaltisParados = pp;
	}
	
	public Portero (int gr, int pp) {
		this.golesRecibidos = gr;
		this.penaltisParados = pp;
	}

	public int getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(int golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public int getPenaltisParados() {
		return penaltisParados;
	}

	public void setPenaltisParados(int penaltisParados) {
		this.penaltisParados = penaltisParados;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Demarcación: " + demarcacion);
		System.out.println("Partidos Jugados: " + partidosJugados);
		System.out.println("Goles Marcados: " + golesMarcados);
		System.out.println("Tarjetas amarillas:" + tarjetasAmarillas);
		System.out.println("Tarjetas Rojas: " + tarjetasRojas);
		System.out.println("Identificador: " + identificador);
		System.out.println("Goles Recibidos: " + golesRecibidos);
		System.out.println("Penaltis Parados: " + penaltisParados);
	}

	@Override
	public String toString() {
		return "Portero [golesRecibidos=" + golesRecibidos + ", penaltisParados=" + penaltisParados + ", nombre="
				+ nombre + ", demarcacion=" + demarcacion + ", partidosJugados=" + partidosJugados + ", golesMarcados="
				+ golesMarcados + ", tarjetasAmarillas=" + tarjetasAmarillas + ", tarjetasRojas=" + tarjetasRojas + "]";
	}
	
	

}

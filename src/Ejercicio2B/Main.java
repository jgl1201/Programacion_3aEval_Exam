package Ejercicio2B;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

	public static ArrayList<Jugador> equipo = new ArrayList<Jugador>();

	public static void main(String[] args) {
		FileWriter archivo = null;
		PrintWriter impresor = null;

		Portero p1 = new Portero("Casillas", "Portero", 1000, 4, 5, 1, 122, 248);
		Portero p2 = new Portero("Buffon", "Portero", 1260, 2, 7, 3, 154, 322);
		Portero p3 = new Portero("Neuer", "Portero", 1300, 7, 10, 2, 300, 500);
		Jugador j1 = new Jugador("Pepe", "Defensa", 564, 1, 212, 122);
		Jugador j2 = new Jugador("Xabi Alonso", "Medio", 789, 56, 27, 12);

		equipo.add(p1);
		equipo.add(p2);
		equipo.add(p3);
		equipo.add(j1);
		equipo.add(j2);
		
		Portero aux = new Portero();
		
		for (Jugador j : equipo) {
			if (j instanceof Portero) {
				j = (Portero) aux;
				try {
					archivo = new FileWriter(
							"C:\\Users\\Primero DAM\\eclipse-workspace\\Eval3_Prog_examen\\src\\Ejercicio2B\\fichero.txt");
					impresor = new PrintWriter(archivo);
					impresor.println("Portero: " + aux.nombre);
					impresor.println("Goles marcados: " + aux.golesMarcados);
					impresor.println("Partidos jugados: " + aux.partidosJugados);
					impresor.println("Amarillas: " + aux.tarjetasAmarillas);
					impresor.println("Rojas: " + aux.tarjetasRojas);
					impresor.println("Goles recibios: " + aux.getGolesRecibidos());
					impresor.println("Penaltis parados: " + aux.getPenaltisParados());
					impresor.println("-------------------------------------------");
				} catch (Exception e) {
					System.out.println(e.getMessage());
	
				}
			}
		}
	}

}

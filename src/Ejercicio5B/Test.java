package Ejercicio5B;

import java.util.ArrayList;

public class Test {

	static ArrayList<Ciclista> equipo = new ArrayList<Ciclista>();

	public static void main(String[] args) {
		Equipo sky = new Equipo("Sky", "Estados Unidos");
		Velocista gt = new Velocista(123979, "Geraint Thomas", 320, 25);
		Escalador eb = new Escalador(123980, "Egan Bernal", 25, 10);
		Contrarrelojista jc = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);
		
		Equipo mov = new Equipo("Movistar", "Espanha");
		Velocista v = new Velocista(125979, "Pepe Luis", 320, 25);
		Escalador e = new Escalador(125980, "Alba Cete", 25, 10);
		Contrarrelojista c = new Contrarrelojista(125981, "Johny Melabo", 120);
		
		Equipo e3 = new Equipo("Pepe", "Brasil");
		Velocista v3 = new Velocista(1, "Pepe Dominguez", 320, 30);
		Escalador es3 = new Escalador(2, "Angel Gonzalez", 27, 12);
		Contrarrelojista c3 = new Contrarrelojista(3, "Antonio Benito", 150);
		
		Equipo e4 = new Equipo("DAM", "Espanha");
		Velocista v4 = new Velocista(4, "PApo", 400, 36);
		Escalador es4 = new Escalador(5, "jmoihoui",32, 20);
		Contrarrelojista c4 = new Contrarrelojista(6, "Dina Mita", 200);
		
		sky.anadirCiclista(gt);
		sky.anadirCiclista(eb);
		sky.anadirCiclista(jc);
		System.out.println(sky.toString());
		
		mov.anadirCiclista(v);
		mov.anadirCiclista(e);
		mov.anadirCiclista(c);
		System.out.println(mov.toString());
		
		e3.anadirCiclista(v3);;
		e3.anadirCiclista(es3);
		e3.anadirCiclista(c3);
		System.out.println(e3.toString());
		
		e4.anadirCiclista(v4);
		e4.anadirCiclista(es4);;
		e4.anadirCiclista(c4);
		System.out.println(e4.toString());
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");
		
		gt.setTiempoAcumulado(365);
		eb.setTiempoAcumulado(300);
		jc.setTiempoAcumulado(250);
		
		v.setTiempoAcumulado(330);
		e.setTiempoAcumulado(290);
		c.setTiempoAcumulado(280);
		
		v3.setTiempoAcumulado(300);
		es3.setTiempoAcumulado(280);
		c3.setTiempoAcumulado(265);
		
		v4.setTiempoAcumulado(285);
		es4.setTiempoAcumulado(260);
		c4.setTiempoAcumulado(250);
		
		System.out.println(sky.calcularTotalTiempo());
		System.out.println(mov.calcularTotalTiempo());
		System.out.println(e3.calcularTotalTiempo());
		System.out.println(e4.calcularTotalTiempo());
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");

		System.out.println(sky.toString());
		sky.listarEquipo();
		System.out.println(mov.toString());
		mov.listarEquipo();
		System.out.println(e3.toString());
		e3.listarEquipo();
		System.out.println(e4.toString());
		e4.listarEquipo();
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");
		
		sky.sort();
		mov.sort();
		e3.sort();
		e4.sort();
		sky.asignarPosiciones();
		mov.asignarPosiciones();
		e3.asignarPosiciones();
		e4.asignarPosiciones();
		sky.listarEquipo();
		mov.listarEquipo();
		e3.listarEquipo();
		e4.listarEquipo();
	}
}

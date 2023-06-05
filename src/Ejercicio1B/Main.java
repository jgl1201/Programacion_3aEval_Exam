package Ejercicio1B;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		SalaCine s1 = new SalaCine("Grande 1", 4);
		SalaCine s2 = new SalaCine("Med 2", 3);
		SalaCine s3 = new SalaCine("Peque 3", 2);
		
		String action;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("M meter persona || S sacar persona || SALIR");
			action = sc.nextLine();

			if (action.equalsIgnoreCase("m")) {
				if (s1.hayHueco()) s1.MetePersona();
				else if (s2.hayHueco()) s2.MetePersona();
				else if (s3.hayHueco()) s3.MetePersona();
				else System.out.println("No hay huecos disponibles, espere");
			}
			else if (action.equalsIgnoreCase("s")) {
				if (s1.hayPersona()) s1.SacaPersona();
				else if (s2.hayPersona()) s2.SacaPersona();
				else if (s3.hayPersona()) s3.SacaPersona();
				else System.out.println("No hay personas todavia");
			}
			else if (action.equalsIgnoreCase("salir")) System.out.println("Saliendo");
			else System.out.println("Opcion no valida");
			
		} while (! action.equalsIgnoreCase("salir"));
		
		sc.close();
	}

}

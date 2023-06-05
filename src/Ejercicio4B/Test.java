package Ejercicio4B;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Inmueble> terrenos = new ArrayList<Inmueble>();
		
		ApartaEstudio ae = new ApartaEstudio(1, 10, "Avenida de Pepe 1", 1, 1);
		ApartamentoFamiliar af = new ApartamentoFamiliar(2, 100, "Avenida de Don Antonio 1", 3, 2, 200000);
		CasaConjuntoCerrado ccc = new CasaConjuntoCerrado(3, 250, "Avenida de Angel 1", 5, 4, 3, 400000, true, false);
		CasaIndependiente ci = new CasaIndependiente(4, 325, "Avenida de Pepe 2", 7, 4, 3);
		CasaRural cr = new CasaRural(5, 500, "Avenida de Don Antonio 2", 8, 4, 3, 1200, 8d);
		LocalComercial lc = new LocalComercial(6, 300, "Avenida de Angel 2", "No");
		Oficina o = new Oficina(7, 150, "Avenida de Pepe 3", false);
		
		terrenos.add(ae);
		terrenos.add(af);
		terrenos.add(ccc);
		terrenos.add(ci);
		terrenos.add(cr);
		terrenos.add(lc);
		terrenos.add(o);
		// 1.
		for (Inmueble i : terrenos) {
			System.out.println(i.toString());
			System.out.println(i.calculaPrecioVenta());
		}
		// 2.
		int total = 0;
		for (Inmueble i : terrenos) total += i.calculaPrecioVenta();
		System.out.println(total);
		// 3.
		int mediaMetro = 0;
		for (Inmueble i : terrenos) mediaMetro += i.calculaPrecioVenta() / i.area;
		mediaMetro /= terrenos.size();
		System.out.println(mediaMetro);
		// 4.
		
		// 5.
		for (Inmueble i : terrenos) System.out.println("Impuestos: " + i.calcularImpuesto());
		// 6.
		int totalImpuesto = 0;
		for (Inmueble i : terrenos) totalImpuesto += i.calcularImpuesto();
		System.out.println("Impuestos totales: " + totalImpuesto);
	}

}

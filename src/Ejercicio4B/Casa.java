package Ejercicio4B;

abstract public class Casa extends Vivienda implements Impuesto{
	
	protected int numeroPisos;
	
	

	public Casa(int id, int area, String direccion, int numeroHabitaciones, int numeroBannos,
			int numeroPisos) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos);
		this.numeroPisos = numeroPisos;
	}

	@Override
	public String toString() {
		return "Casa [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBannos="
				+ numeroBannos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + ", precioVenta="
				+ precioVenta + "]";
	}

	@Override
	abstract public double calculaPrecioVenta();
	
	@Override
	public double calcularImpuesto() {
		return 0.07 * precioVenta;
	}
	

}

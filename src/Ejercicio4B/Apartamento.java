package Ejercicio4B;

abstract public class Apartamento extends Vivienda implements Impuesto{

	public Apartamento(int id, int area, String direccion,
			int numeroHabitaciones, int numeroBannos) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apartamento [numeroHabitaciones=" + numeroHabitaciones + ", numeroBannos=" + numeroBannos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	abstract public double calculaPrecioVenta();
	
	@Override
	public double calcularImpuesto() {
		return 0.05 * precioVenta;
	}
	

}

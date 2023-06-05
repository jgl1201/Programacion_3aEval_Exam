package Ejercicio4B;

abstract public class Vivienda extends Inmueble implements Impuesto{
	
	protected int numeroHabitaciones;
	protected int numeroBannos;

	
	
	public Vivienda(int id, int area, String direccion,
			int numeroHabitaciones, int numeroBannos) {
		super(id, area, direccion);
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBannos = numeroBannos;
	}

	@Override
	public String toString() {
		return "Vivienda [numeroHabitaciones=" + numeroHabitaciones + ", numeroBannos=" + numeroBannos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	abstract public double calculaPrecioVenta();
	
	@Override
	public double calcularImpuesto() {
		return 500 * numeroHabitaciones + 400 * numeroBannos;
	}
	
}

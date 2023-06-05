package Ejercicio4B;

abstract public class Local extends Inmueble implements Impuesto {

	public Local(int id, int area, String direccion) {
		super(id, area, direccion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Local [id=" + id + ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	abstract public double calculaPrecioVenta();
	
	@Override
	public double calcularImpuesto() {
		return 0.04 * precioVenta;
	}
	

}

package Ejercicio4B;

abstract public class Inmueble implements Impuesto {

	protected int id;
	protected int area;
	protected String direccion;
	protected double precioVenta;
	
	public Inmueble(int id, int area, String direccion) {
		super();
		this.id = id;
		this.area = area;
		this.direccion = direccion;
	}

	public String toString() {
		return "Inmueble [identificador=" + id + ", area=" + area + ", direccion=" + direccion
				+ ", precioVenta=" + precioVenta + "]";
	}
	
	abstract public double calculaPrecioVenta();
	
}

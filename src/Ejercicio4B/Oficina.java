package Ejercicio4B;

public class Oficina extends Local {

	protected final double VALOR_AREA = 3500000;
	protected boolean esGobierno;
	
	

	public Oficina(int id, int area, String direccion, boolean esGobierno) {
		super(id, area, direccion);
		this.esGobierno = esGobierno;
	}

	@Override
	public String toString() {
		return "Oficina [valorArea=" + VALOR_AREA + ", esGobierno=" + esGobierno + ", id=" + id + ", area=" + area
				+ ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return VALOR_AREA * area;
	}
	
	@Override
	public double calcularImpuesto() {
		return 0.04 * precioVenta + 4000;
	}
	

}

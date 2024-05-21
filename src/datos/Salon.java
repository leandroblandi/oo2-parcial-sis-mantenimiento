package datos;

public class Salon extends Ambiente {
	private int cantidadDeMesas;
	private int cantidadDeSillas;
	private int capacidad;

	public Salon(int cantidadDeMesas, int cantidadDeSillas, int capacidad) {
		super();
		this.cantidadDeMesas = cantidadDeMesas;
		this.cantidadDeSillas = cantidadDeSillas;
		this.capacidad = capacidad;
	}

	public Salon() {

	}

	public int getCantidadDeMesas() {
		return cantidadDeMesas;
	}

	public void setCantidadDeMesas(int cantidadDeMesas) {
		this.cantidadDeMesas = cantidadDeMesas;
	}

	public int getCantidadDeSillas() {
		return cantidadDeSillas;
	}

	public void setCantidadDeSillas(int cantidadDeSillas) {
		this.cantidadDeSillas = cantidadDeSillas;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Salon [ " + super.toString() + " cantidadDeMesas=" + cantidadDeMesas + ", cantidadDeSillas="
				+ cantidadDeSillas + ", capacidad=" + capacidad + "]";
	}

}
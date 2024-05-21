package datos;

public class Habitacion extends Ambiente {
	private int plazas;

	public Habitacion() {
	}

	public Habitacion(String ambiente, int plazas) {
		super(ambiente);
		this.plazas = plazas;
	}

	public Habitacion(int plazas) {

		this.plazas = plazas;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		return "Habitacion [ " + super.toString() + " plazas=" + plazas + "]";
	}

}
package datos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class OrdenMantenimiento {
	private int idOrden;
	private String nroOrdenMantenimiento;
	private Ambiente ambiente;
	private String motivo;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double costoDeReparacion;
	private boolean terminada;
	private boolean pagada;
	private String estadoDuranteLaReparacion;

	public OrdenMantenimiento() {
		super();
	}

	public OrdenMantenimiento(Ambiente ambiente, String motivo, LocalDate fechaInicio, LocalDate fechaFin,
			String nroOrdenMantenimiento, double costoDeReparacion, boolean terminada, boolean pagada,
			String estadoDuranteLaReparacion) {
		super();
		this.nroOrdenMantenimiento = nroOrdenMantenimiento;
		this.ambiente = ambiente;
		this.motivo = motivo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costoDeReparacion = costoDeReparacion;
		this.terminada = terminada;
		this.pagada = pagada;
		this.estadoDuranteLaReparacion = estadoDuranteLaReparacion;
	}

	public long tiempoDeEjecucion() {
		return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}

	public int getIdOrden() {
		return idOrden;
	}

	protected void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	public String getNroOrdenMantenimiento() {
		return nroOrdenMantenimiento;
	}

	public void setNroOrdenMantenimiento(String nroOrdenMantenimiento) {
		this.nroOrdenMantenimiento = nroOrdenMantenimiento;
	}

	public Ambiente getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public double getCostoDeReparacion() {
		return costoDeReparacion;
	}

	public void setCostoDeReparacion(double costoDeReparacion) {
		this.costoDeReparacion = costoDeReparacion;
	}

	public boolean isTerminada() {
		return terminada;
	}

	public void setTerminada(boolean terminada) {
		this.terminada = terminada;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public String getEstadoDuranteLaReparacion() {
		return estadoDuranteLaReparacion;
	}

	public void setEstadoDuranteLaReparacion(String estadoDuranteLaReparacion) {
		this.estadoDuranteLaReparacion = estadoDuranteLaReparacion;
	}

	@Override
	public String toString() {
		return "OrdenDeMantenimiento [idOrden=" + idOrden + ", ambiente=" + ambiente + ", motivo=" + motivo
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", costoDeReparacion=" + costoDeReparacion
				+ ", terminada=" + terminada + ", pagada=" + pagada + ", estadoDuranteLaReparacion="
				+ estadoDuranteLaReparacion + "]";
	}

}
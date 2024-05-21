package abm;

import java.util.ArrayList;
import java.util.List;

import abm.datos.Informe;
import dao.OrdenMantenimientoDao;
import datos.Ambiente;
import datos.OrdenMantenimiento;

public class OrdenMantenimientoAbm {
	private static OrdenMantenimientoAbm instancia = null;
	private OrdenMantenimientoDao dao;

	private OrdenMantenimientoAbm() {
		this.dao = OrdenMantenimientoDao.getInstancia();
	}

	public static OrdenMantenimientoAbm getInstancia() {
		if (instancia == null) {
			return new OrdenMantenimientoAbm();
		}
		return instancia;
	}

	public List<OrdenMantenimiento> traer(Ambiente ambiente) {
		return dao.traer(ambiente);
	}

	public List<OrdenMantenimiento> traer(boolean pagada) {
		return dao.traer(pagada);
	}

	public List<OrdenMantenimiento> traer(Ambiente ambiente, boolean terminada) {
		List<OrdenMantenimiento> ordenes = dao.traer(ambiente);
		List<OrdenMantenimiento> ordenesFiltradas = new ArrayList<>();

		for (OrdenMantenimiento orden : ordenes) {
			if (orden.isTerminada() == terminada) {
				ordenesFiltradas.add(orden);
			}
		}

		return ordenesFiltradas;
	}

	public void calcularTiemposEjecucion(Ambiente ambiente) {
		List<OrdenMantenimiento> ordenes = traer(ambiente);

		for (OrdenMantenimiento orden : ordenes) {
			System.out.printf("\nTiempo ejecucion para orden con id = %d -> %d dias", orden.getIdOrden(),
					orden.tiempoDeEjecucion());
		}
	}

	public Informe traerInforme(boolean pagada) {
		List<OrdenMantenimiento> ordenes = traer(pagada);
		double sumaTotal = 0d;

		for (OrdenMantenimiento orden : ordenes) {
			sumaTotal += orden.getCostoDeReparacion();
		}
		return new Informe(ordenes, sumaTotal);
	}
}

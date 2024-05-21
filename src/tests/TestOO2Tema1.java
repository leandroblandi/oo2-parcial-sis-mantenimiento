package tests;

import java.util.List;

import abm.AmbienteAbm;
import abm.OrdenMantenimientoAbm;
import abm.datos.Informe;
import datos.Ambiente;
import datos.OrdenMantenimiento;

public class TestOO2Tema1 {
	private static AmbienteAbm ambienteAbm = AmbienteAbm.getInstancia();
	private static OrdenMantenimientoAbm ordenesAbm = OrdenMantenimientoAbm.getInstancia();

	public static void main(String[] args) {

		Ambiente ambiente = ambienteAbm.traer(2);
		System.out.printf("\n=== CU1 ===\n");
		System.out.printf("\n%s\n", ambiente);

		List<OrdenMantenimiento> ordenes = ordenesAbm.traer(ambiente);
		System.out.printf("\n=== CU2 ===\n");
		System.out.printf("\n%s\n", ordenes);

		List<OrdenMantenimiento> ordenesSinTerminar = ordenesAbm.traer(ambiente, false);
		System.out.printf("\n=== CU3 ===\n");
		System.out.printf("\n%s\n", ordenesSinTerminar);

		System.out.printf("\n=== CU4 ===\n");
		ordenesAbm.calcularTiemposEjecucion(ambiente);

		Informe informe = ordenesAbm.traerInforme(false);
		System.out.printf("\n\n=== CU5 ===\n");
		System.out.printf("\n%s\n", informe);
	}
}

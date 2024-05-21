package abm;

import dao.AmbienteDao;
import datos.Ambiente;

public class AmbienteAbm {
	private static AmbienteAbm instancia = null;
	private AmbienteDao ambienteDao;

	private AmbienteAbm() {
		this.ambienteDao = AmbienteDao.getInstancia();
	}

	public static AmbienteAbm getInstancia() {
		if (instancia == null) {
			return new AmbienteAbm();
		}
		return instancia;
	}

	public Ambiente traer(int id) {
		return ambienteDao.traer(id);
	}
}

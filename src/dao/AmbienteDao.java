package dao;

import datos.Ambiente;

public class AmbienteDao extends Dao<Ambiente> {
	private static AmbienteDao instancia = null;

	private AmbienteDao() {

	}

	public static AmbienteDao getInstancia() {
		if (instancia == null) {
			return new AmbienteDao();
		}
		return instancia;
	}

	public Ambiente traer(int idAmbiente) {
		Ambiente ambiente = null;
		try {
			iniciaOperacion();
			ambiente = (Ambiente) session.get(Ambiente.class, idAmbiente);

		} finally {
			session.close();
		}
		return ambiente;
	}
}

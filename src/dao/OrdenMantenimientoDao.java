package dao;

import java.util.List;

import datos.Ambiente;
import datos.OrdenMantenimiento;

public class OrdenMantenimientoDao extends Dao<OrdenMantenimiento> {
	private static OrdenMantenimientoDao instancia = null;

	private OrdenMantenimientoDao() {

	}

	public static OrdenMantenimientoDao getInstancia() {
		if (instancia == null) {
			return new OrdenMantenimientoDao();
		}
		return instancia;
	}

	public List<OrdenMantenimiento> traer(Ambiente ambiente) {
		List<OrdenMantenimiento> ordenes = null;

		try {
			iniciaOperacion();
			String hql = "from OrdenMantenimiento o join fetch o.ambiente a where a.idAmbiente = :idAmbiente";
			ordenes = session.createQuery(hql, OrdenMantenimiento.class)
					.setParameter("idAmbiente", ambiente.getIdAmbiente()).getResultList();

		} finally {
			session.close();
		}
		return ordenes;
	}

	public List<OrdenMantenimiento> traer(boolean pagada) {
		List<OrdenMantenimiento> ordenes = null;

		try {
			iniciaOperacion();
			String hql = "from OrdenMantenimiento o join fetch o.ambiente where o.pagada = :pagada";
			ordenes = session.createQuery(hql, OrdenMantenimiento.class).setParameter("pagada", pagada).getResultList();

		} finally {
			session.close();
		}
		return ordenes;
	}
}

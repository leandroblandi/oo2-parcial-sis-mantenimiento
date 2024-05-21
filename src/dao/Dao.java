package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.util.HibernateUtil;

public abstract class Dao<T> {

	// private Class<T> clasePersistente;
	protected static Session session;
	protected Transaction tx;

	protected void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	protected void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public int agregar(T objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();

		} catch (HibernateException he) {
			manejaExcepcion(he);

		} finally {
			session.close();
		}
		return id;
	}

	public void actualizar(T objeto) {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();

		} catch (HibernateException he) {
			manejaExcepcion(he);

		} finally {
			session.close();

		}
	}

	public void eliminar(T objeto) {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();

		} catch (HibernateException he) {
			manejaExcepcion(he);

		} finally {
			session.close();

		}
	}

}
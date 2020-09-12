package br.com.prog3.trabalho4.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.prog3.trabalho4.model.Empregado;
import br.com.prog3.trabalho4.util.HibernateUtil;

public class EmpregadoDaoImp implements EmpregadoDao {

	private Session session;

	public void incluir(Empregado empregado) {
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(empregado);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public void alterar(Empregado empregado) {
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.update(empregado);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public void excluir(Empregado empregado) {
		session = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.delete(empregado);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public List<Empregado> listarTodos() {
		session = null;
		List<Empregado> lista = null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			lista = session.createQuery("from Empregado").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			return lista;
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return lista;
	}

	public Empregado buscarPeloCPF(String cpf) {
		session = null;
		Empregado empregado = new Empregado();
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			empregado = (Empregado) session.load(Empregado.class, cpf);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null) {
				session.getTransaction().rollback();
			}
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return empregado;

	}

}

package br.com.prog3.trabalho4.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import br.com.prog3.trabalho4.model.Empregado;
import br.com.prog3.trabalho4.model.Dependente;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
// loads configuration and mappings
			Configuration configuration = new Configuration().configure();
			configuration.addPackage("br.com.prog3.trabalho4.model");
			configuration.addAnnotatedClass(Empregado.class);
			configuration.addAnnotatedClass(Dependente.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
// builds a session factory from the service registry
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
	}
}
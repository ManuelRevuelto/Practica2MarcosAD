package ProyectoMarcos.BBDD;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class BbddMarcos {

	private static BbddMarcos singleton;
	private Session sesion;
	private SessionFactory factory;

	public static BbddMarcos setUp() {

		if (singleton == null) {
			BbddMarcos hu = new BbddMarcos();
			Configuration configuration = new Configuration().configure();
			hu.factory = configuration
					.buildSessionFactory(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build());
			hu.sesion = hu.factory.openSession();
			singleton = hu;
			return hu;
		} else {

			return singleton;
		}

	}

	public void shutDown() {
		sesion.close();
		factory.close();
	}

	public Session getSession() {
		return sesion;
	}

}

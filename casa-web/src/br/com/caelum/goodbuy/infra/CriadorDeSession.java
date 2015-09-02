package br.com.caelum.goodbuy.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class CriadorDeSession {

	@SuppressWarnings("deprecation")
	public static Session getSession() {
		@SuppressWarnings("deprecation")
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}

}

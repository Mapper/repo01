package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.com.caelum.goodbuy.modelo.Produto;


public class AdicaoDeProduto {
	public static void main(String[] args) {
		// configuration = new AnnotationConfiguration();
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);
	//SessionFactory factory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
	Produto produto = new Produto();
	produto.setNome("prateleira");
	produto.setDescricao("prateleira de livros");
	produto.setPreco(35.90);
	
	Transaction tx = session.beginTransaction();
	session.save(produto);
	tx.commit();
	
	
	
	
	}

}

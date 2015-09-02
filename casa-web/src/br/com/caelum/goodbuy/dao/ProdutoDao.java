package br.com.caelum.goodbuy.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.ioc.Component;


@Component
public class ProdutoDao {
	
	public ArrayList<Produto> listaProdutos;
	
//	public List<Produto> listaTudo() {
//		return this.session.createCriteria(Produto.class).list();
//	}
	public void insereProduto() {
		Produto produto = new Produto();
		produto.setNome("Prateleira");
		produto.setDescricao("Uma prateleira para colocar livros");
		produto.setPreco(35.90);
		
		//Transaction tx = session.beginTransaction();
	    //session.save(produto);        
	    //tx.commit();
		
		System.out.println(produto.getNome());
		System.out.println(produto.getDescricao());
		System.out.println(produto.getPreco());
	}		
	
	
	public List<Produto> listaTudo() {
		Produto produto = new Produto();
		produto.setNome("Prateleira");
		produto.setDescricao("Uma prateleira para colocar livros");
		produto.setPreco(35.90);
		
		Produto produto2 = new Produto();
		produto2.setNome("Prateleira-2");
		produto2.setDescricao("2 - Uma prateleira para colocar livros");
		produto2.setPreco(235.90);
		
		System.out.println("produtos criado e inserido");
		System.out.println();
		
		//listaProdutos = new List(<Produto>);
		
		List<Produto> listaProdutos2 = new ArrayList<Produto>();
		//listaProdutos.add(produto);
		//listaProdutos.
		listaProdutos2.add(produto);
		listaProdutos2.add(produto2);
		
		return listaProdutos2;
	}


	public void salva(Produto produto) {
		Session session = CriadorDeSession.getSession();
		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}	
		


}

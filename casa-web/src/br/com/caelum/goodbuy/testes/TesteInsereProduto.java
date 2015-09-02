package br.com.caelum.goodbuy.testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.Session;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.modelo.Produto;



public class TesteInsereProduto {
	public static void main(String[] args) {
		
		//obter sessão
		Session session = CriadorDeSession.getSession();
		
		//criaProduto();
		Produto produto = criaProduto();
		
		new ProdutoDao().salva(produto);
		
		
	}

	private static Produto criaProduto() {
		Produto produto = new Produto();
		produto.setNome("Prateleira");
		produto.setDescricao("Uma prateleira para colocar livros");
		produto.setPreco(35.90);
		
		System.out.println(produto.getNome());
		System.out.println(produto.getDescricao());
		System.out.println(produto.getPreco());
		return produto;
	}

//	private static void criaProduto() {
//		Produto produto = new Produto();
//		produto.setNome("Prateleira");
//		produto.setDescricao("Uma prateleira para colocar livros");
//		produto.setPreco(35.90);
//		
//		System.out.println(produto.getNome());
//		System.out.println(produto.getDescricao());
//		System.out.println(produto.getPreco());
//
//
//	}

}

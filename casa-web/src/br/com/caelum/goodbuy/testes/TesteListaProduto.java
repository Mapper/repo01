package br.com.caelum.goodbuy.testes;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class TesteListaProduto {
	
			//private static ProdutoDao dao;
            //private static List<Produto> listaProdutos;
            
	public static void main(String[] args) {
		
		ProdutoDao dao = new ProdutoDao();
		
		// TODO Auto-generated method stub
		
		 List<Produto> listaProdutos = (ArrayList<Produto>) dao.listaTudo();
		 
		 System.out.println(listaProdutos.get(0).getNome());
		 System.out.println(listaProdutos.get(1).getNome());
		 System.out.println(listaProdutos.size());

	}

}
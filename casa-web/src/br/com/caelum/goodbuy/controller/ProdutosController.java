package br.com.caelum.goodbuy.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.Resource;


@Resource
public class ProdutosController {
	
	private final ProdutoDao dao;

	public ProdutosController(ProdutoDao dao) {
		this.dao = dao;
	}
	
	public List<Produto> lista() {
		List<Produto> listaProdutos = dao.listaTudo();
		 
		 System.out.println(listaProdutos.get(0).getNome());
		 System.out.println(listaProdutos.get(1).getNome());
		return listaProdutos;
		
	}
	
	public List<String> paises() {
		List<String> result = new ArrayList<String>();
		 result.add("Brasil");
		 result.add("Portugal");
		 result.add("Japão");
		 result.add("Canadá");
		 result.add("Paraguai");
		 System.out.println("paises");

		 return result;
		
	}
	
	public void boasVindas() {
		System.out.println("ol� mundo!");
		}
	

}

package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.dao.ProdutoDAO;
import br.com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoDAO dao;

	@RequestMapping("/produtos/form")
	public String form() {
		System.out.println("Chamando Controller cadastro de produtos");
		return "produto/formCadastro";
	}

	@RequestMapping("/produtos")
	public String salvarLivro(Produto produto) {
		System.out.println("Salvando Livro: " + produto.getTitulo());
		dao.salvarDAO(produto);
		return "produto/sucesso";
	}
}

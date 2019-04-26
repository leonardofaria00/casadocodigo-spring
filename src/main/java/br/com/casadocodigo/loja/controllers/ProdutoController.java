package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.dao.ProdutoDAO;
import br.com.casadocodigo.loja.models.Produto;

/**
 * 
 * @author Leonardo Faria
 *
 *         Anotar com @Controller, @Autowired, e @RequestMapping Implementar
 *         métodos form, salvar, alterar e excluir.
 */
@Controller
public class ProdutoController {

	@Autowired
	private ProdutoDAO dao;

	@RequestMapping("/produtos")
	public String form() {
		System.out.println("Chamando formulário de cadastro do Livro");
		return "produto/form";
	}

	@RequestMapping("/produtos/add")
	public String salvar(Produto produto) {
		System.out.println("Chamou método salvarLivro");
		dao.salvarDAO(produto);
		return "produto/sucesso";
	}
}

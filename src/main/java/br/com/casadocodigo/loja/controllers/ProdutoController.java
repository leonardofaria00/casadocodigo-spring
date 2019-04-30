package br.com.casadocodigo.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView form() {
		System.out.println("Chamando formulário de cadastro do Livro");
		ModelAndView view = new ModelAndView("produto/form");
		return view;
	}

	@RequestMapping("/produtos/add")
	public ModelAndView salvar(Produto produto) {
		System.out.println("Chamando salvar Livro");
		dao.salvarDAO(produto);
		ModelAndView view = new ModelAndView("produto/sucesso");
		return view;
	}

	@RequestMapping("/produtos/lista")
	public ModelAndView lista() {
		System.out.println("Chamando lista de Livros");
		List<Produto> produtos = dao.listar();
		ModelAndView view = new ModelAndView("produto/lista");
		view.addObject("livros", produtos);
		return view;
	}
}

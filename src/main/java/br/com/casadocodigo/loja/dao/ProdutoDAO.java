package br.com.casadocodigo.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

/**
 * 
 * @author Leonardo Faria
 * 
 *         Sempre anotar com @Repository, @Transactional e @PersistenceContext
 *
 */
@Repository
@Transactional
public class ProdutoDAO {

	@PersistenceContext
	private EntityManager manager;

	public void salvarDAO(Produto produto) {
		System.out.println("Salvando " + produto);
		manager.persist(produto);
	}

	public void buscaProdutos() {
		System.out.println("Buscanto todos os livros");
		manager.find(Produto.class, 10);
	}
}

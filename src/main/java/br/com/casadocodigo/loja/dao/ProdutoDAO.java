package br.com.casadocodigo.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

@Transactional
@Repository
public class ProdutoDAO {

	@PersistenceContext
	private EntityManager manager;

	public void salvarDAO(Produto produto) {
		System.out.println("persistindo dados no banco");
		manager.persist(produto);
	}
}
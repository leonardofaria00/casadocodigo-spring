package br.com.casadocodigo.loja.dao;

import java.util.List;

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

	public void salvar(Produto produto) {
		if (produto.getId().equals(null)) {
			System.out.println("Salvando " + produto);
			manager.persist(produto);
		} else {
			System.out.println("Atualizando " + produto);
			manager.merge(produto);
		}

	}

	public List<Produto> buscar() {
		System.out.println("Buscanto todos os livros");
		return manager.createQuery("select p from Produto p", Produto.class).getResultList();
	}

}

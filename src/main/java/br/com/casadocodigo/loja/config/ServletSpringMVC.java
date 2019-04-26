package br.com.casadocodigo.loja.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.casadocodigo.loja.dao.ProdutoDAO;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppWebConfiguration.class, ProdutoDAO.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" }; // retorna todos os mapeamentos a partir do /
	}

}

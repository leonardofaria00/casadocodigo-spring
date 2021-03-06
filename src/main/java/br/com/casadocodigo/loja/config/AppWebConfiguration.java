package br.com.casadocodigo.loja.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.casadocodigo.loja.controllers.HomeController;
import br.com.casadocodigo.loja.dao.ProdutoDAO;
/**
 * 
 * @author Leonardo Faria
 *
 * Anotar com @EnableWebMvc, @ComponentScan e @Bean
 * 
 * Implementar método InternalResourceViewResolver()
 *
 */
@EnableWebMvc
@ComponentScan(basePackageClasses = { HomeController.class, ProdutoDAO.class})
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}

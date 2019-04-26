package br.com.casadocodigo.loja.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
/**
 * 
 * @author Leonardo Faria
 *
 * Anotar com @EnableTransactionManagement e @Bean
 * 
 * Implementar método LocalContainerEntityManagerFactoryBean()
 * Instancia o objeto LocalContainerEntityManagerFactoryBean
 * Instancia o objeto HibernateJpaVendorAdapter do tipo JpaVendorAdapter
 * Instancia o objeto DriverManagerDataSource
 * Instancia o objeto Properties
 * Implementar método JpaTransactionManager()
 *
 */
@EnableTransactionManagement
public class JPAConfiguration {

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		JpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(vendor);// 1 Definindo JpaVendorAdapter

		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setUsername("root");
		data.setPassword("");
		data.setUrl("jdbc:mysql://localhost:3306/casadocodigo");
		data.setDriverClassName("com.mysql.jdbc.Driver");
		factory.setDataSource(data);// 2 Definindo DataSource

		Properties pro = new Properties();
		pro.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		pro.setProperty("hibernate.show_sql", "true");
		pro.setProperty("hibernate.hbm2ddl.auto", "update");

		factory.setJpaProperties(pro);// 3 Definindo Proprieties

		factory.setPackagesToScan("br.com.casadocodigo.loja.models");// 4 Definindo PackagesToScan

		return factory; // 5 Retornando Factory
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}
}

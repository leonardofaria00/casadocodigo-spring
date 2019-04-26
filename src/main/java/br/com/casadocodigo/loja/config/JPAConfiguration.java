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

@EnableTransactionManagement
public class JPAConfiguration {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();

		JpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(vendor);// Passando o tipo de adaptação do JPA que nesse caso é o Hibernate

		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setUsername("root");
		data.setPassword("");
		data.setUrl("jdbc:mysql://localhost:3306/casadocodigo");
		data.setDriverClassName("com.mysql.jdbc.Driver");
		factory.setDataSource(data);// Passando dados de conexão para a fabrica

		Properties pro = new Properties();
		pro.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		pro.setProperty("hibernate.show_sql", "true");
		pro.setProperty("hibernate.hbm2ddl.auto", "update");

		factory.setJpaProperties(pro);// Passando propriedades para a fabrica

		factory.setPackagesToScan("br.com.casadocodigo.loja.models");

		return factory;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}
}

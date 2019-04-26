package br.com.casadocodigo.loja.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
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
		factory.setJpaVendorAdapter(vendor);

		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost/3306/casadocodigo");
		data.setUsername("root");
		data.setPassword("");

		Properties pro = new Properties();
		pro.setProperty("hibernate.dialect", "org.hibernate.dialet.MySQL5Dialet");
		pro.setProperty("hibernate.show.sql", "true");
		pro.setProperty("hibernate.hbm2ddl.auto", "update");

		factory.setJpaProperties(pro);
		factory.setPackagesToScan("br.com.casadocodigo.loja.models");

		return factory;
	}
}

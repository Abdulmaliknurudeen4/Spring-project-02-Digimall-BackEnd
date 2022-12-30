package com.alpha.practice.digimallbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.alpha.practice.digimallbackend.*" })
@EnableTransactionManagement
public class HiberConfig {
	// Change the below based on the DBMS you choose
	private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/digimall";
	private final static String DATABASE_DRIVER = "org.h2.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME = "sa";
	private final static String DATABASE_PASSWORD = "";

	// DataSource will be provided available
	@Bean("dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);

		return dataSource;
	}

	@Bean
	@Autowired
	public SessionFactory sessionFactory(DataSource datasource) {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(datasource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.alpha.practice.digimallbackend.*");
		return builder.buildSessionFactory();
	}

//Write all Hibernate Properties here and will be returned
	private Properties getHibernateProperties() {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.put("hibernate.dialect", DATABASE_DIALECT);
		prop.put("hibernate.show_sql", "true");
		prop.put("hibernate.format_sql", "true");
		prop.put("hibernate.hbm2ddl.auto", "update");
		return prop;
	}

	// transaction Manager Bean to manage Transaction
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sessionfactory) {
		HibernateTransactionManager transaction = new HibernateTransactionManager(sessionfactory);
		return transaction;
	}

}

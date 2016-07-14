package webconfig;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import service.EmployeeDAO;
import service.EmployeeDAOImpl;
import service.VocabDAO;
import service.VocabDAOImpl;

@Configuration
@ComponentScan("webcontroller")
@EnableTransactionManagement
public class ApplicationContextConfig  {
	
	
//	<mvc:annotation-driven />
//	<mvc:resources mapping="/resources/**" location="/resources/" />
//	<context:component-scan base-package="hibernate.controller" />
//	
//   	<bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
//    	<property name="prefix" value="/WEB-INF/views/" />
//    	<property name="suffix" value=".jsp" />
//	</bean>
//   
//  	<bean id="dataSource" class="org.apache.commons.dbcp2.BasicDataSource" destroy-method="close">
//	    <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
//	    <property name="url" value="jdbc:mysql://localhost:3306/test"/>
//	    <property name="username" value="root"/>
//	    <property name="password" value="root"/>
//	</bean>
//	
//	<bean id="sessionFactory"   class="org.springframework.orm.hibernate4.LocalSessionFactoryBean">
//	    <property name="dataSource" ref="dataSource" />
//	    <property name="configLocation" value="classpath:hibernate.cfg.xml" />
//	</bean>
//	
//	<tx:annotation-driven />
//	<bean id="transactionManager"
//	    class="org.springframework.orm.hibernate4.HibernateTransactionManager">
//	    <property name="sessionFactory" ref="sessionFactory" />
//	</bean>
//	
//	<bean id="userDao" class="hibernate.dao.UserDaoImpl">
//	    <constructor-arg>
//	        <ref bean="sessionFactory" />
//	    </constructor-arg>
//	</bean>
	
	
	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setPrefix("/WEB-INF/views/");
	    viewResolver.setSuffix(".jsp");
	    return viewResolver;
	}
 
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/test");
	    dataSource.setUsername("root");
	    dataSource.setPassword("root");
	 
	    return dataSource;
	}
	
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
	 
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	 
//	    sessionBuilder.addAnnotatedClasses(hibernate.model.User.class);
	 
//    	If you want to add more classes:
//    	sessionBuilder.addAnnotatedClasses(User.class, Object.class);
//    
//    	Or scan packages for annotated classes:
    	sessionBuilder.scanPackages("model");
//    	
//    	In case you want to specify a specific Hibernate property:
//    	sessionBuilder.setProperty("hibernate.show_sql", "true");
//    	
//    	Or specify a set of Hibernate properties:
    	sessionBuilder.addProperties(getHibernateProperties());
	    
	    return sessionBuilder.buildSessionFactory();
	}
	
	private Properties getHibernateProperties() {
	    Properties properties = new Properties();
	    properties.put("hibernate.show_sql", "true");
	    properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	    return properties;
	}
	
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	    return transactionManager;
	}
	
	@Bean(name = "userDao")
	public VocabDAO getVocabDao(SessionFactory sessionFactory) {
	    return new VocabDAOImpl(sessionFactory);
	}
	
	@Bean(name = "employeeDao")
	public EmployeeDAO getEmployeeDao(SessionFactory sessionFactory) {
		return new EmployeeDAOImpl(sessionFactory);
	}
}

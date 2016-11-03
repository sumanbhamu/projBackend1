package com.niit.shopping.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.shopping.dao.CategoryDAO;
import com.niit.shopping.dao.CategoryDAOImpl;
import com.niit.shopping.dao.ProductDAO;
import com.niit.shopping.dao.ProductDAOImpl;
import com.niit.shopping.dao.SupplierDAO;
import com.niit.shopping.dao.SupplierDAOImpl;
import com.niit.shopping.dao.UserDAO;
import com.niit.shopping.dao.UserDAOImpl;
import com.niit.shopping.model.Category;
import com.niit.shopping.model.Product;
import com.niit.shopping.model.Supplier;
import com.niit.shopping.model.User;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement

public class ApplicationContextConfig 
{
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:tcp://localhost/~/suman"); 
	    dataSource.setUsername("sa");
	    dataSource.setPassword("");
	 System.out.println("data source");
	    return dataSource;
	}
	private Properties getHibernateProperties() {
	    Properties properties = new Properties();
	    properties.put("hibernate.show_sql", "true");
	    properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	    properties.put("hibernate.hbm2ddl.auto", "update");
	    //treat every session as a thread
	    properties.put("hibernate.current_session_context_class", "thread");
	    System.out.println("hbernate properties");
	    return properties;
	}
	@Autowired
	@Bean(name="sessionfactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {
		 
	    LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	    sessionBuilder.addProperties(getHibernateProperties());
	 
	/* sessionBuilder.addAnnotatedClasses(UserDetails.class);
	   sessionBuilder.addAnnotatedClasses(Cart.class);
	   sessionBuilder.addAnnotatedClasses(CartItem.class);
	   sessionBuilder.addAnnotatedClasses(Customer.class);
	   
	*/   
	     
	    sessionBuilder.addAnnotatedClasses(User.class);
	    sessionBuilder.addAnnotatedClasses(Product.class);
	    sessionBuilder.addAnnotatedClasses(Category.class);
	    sessionBuilder.addAnnotatedClasses(Supplier.class);
		     
		
	    System.out.println("session factory");
	    
	    return sessionBuilder.buildSessionFactory();
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(
	        SessionFactory sessionFactory) {
	    HibernateTransactionManager transactionManager = new HibernateTransactionManager(
	            sessionFactory);
	    System.out.println("transaction ");
	    return transactionManager;
	}
	  
/*
	    @Autowired
		@Bean(name="supplierDAO")
		public SupplierDAO getSupplierDAO(SessionFactory sessionFactory) {
		    
		 
		    return new SupplierDAOImpl(sessionFactory);
		}

	    @Autowired
	    @Bean(name="supplier")
	    public Supplier getSupplier()
	    {
	    	return new Supplier();
	    }
*/	   @Autowired

//product
		@Bean(name="userDAO")
		public UserDAO getUserDetailsDAO(SessionFactory sessionFactory) {
		    
	System.out.println("user dao");
		    return new UserDAOImpl(sessionFactory);
		}
	    @Autowired
	    @Bean(name="user")
	    public User getUserDetails()
	    {
	    	System.out.println("user");
	    	return new User();
	    }
//product
	    
	    @Autowired
		@Bean(name="productDAO")
		public ProductDAO getProductDAO(SessionFactory sessionFactory) {
		    
	    	System.out.println("product dao");
	    	
		    return new ProductDAOImpl(sessionFactory);
		}
	    @Autowired
	    @Bean(name="product")
	    public Product getProduct()
	    {
	    	System.out.println("product");
	    	
	    	return new Product();
	    }
	   
	    
//category	    
	    
	    @Autowired
		@Bean(name="categoryDAO")
		public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) {
		    
	    	System.out.println("category dao");
	    	
		    return new CategoryDAOImpl( sessionFactory);
		}
	    @Autowired
	    @Bean(name="category")
	    public Category getCategory()
	    {
	    	System.out.println("category ");
	    	
	    	return new Category();
	    }

//supplier	    
	    
	    @Autowired
		@Bean(name="supplierDAO")
		public SupplierDAO getSupplierDAO(SessionFactory sessionFactory) {
		    
	    	System.out.println("supplier dao");
	    	
		    return new SupplierDAOImpl( sessionFactory);
		}
	    @Autowired
	    @Bean(name="supplier")
	    public Supplier getSupplier()
	    {
	    	System.out.println("supplier ");
	    	
	    	return new Supplier();
	    }





}

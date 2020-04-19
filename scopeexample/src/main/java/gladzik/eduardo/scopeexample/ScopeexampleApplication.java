package gladzik.eduardo.scopeexample;

import gladzik.eduardo.scopeexample.dao.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeexampleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ScopeexampleApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC: " + objectDAO1.getObjectJDBC());

		System.out.println("Object DAO: " + objectDAO2);
		System.out.println("Object JDBC: " + objectDAO2.getObjectJDBC());	
	}
}

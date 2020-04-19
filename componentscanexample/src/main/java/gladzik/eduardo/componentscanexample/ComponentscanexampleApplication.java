package gladzik.eduardo.componentscanexample;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("externalclasses") //<- package name
public class ComponentscanexampleApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ComponentscanexampleApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Object DAO: " + objectDAO1);
		System.out.println("Object JDBC: " + objectDAO1.getObjectJDBC());
	}

}

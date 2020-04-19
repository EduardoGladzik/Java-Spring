package gladzik.eduardo.postconstructpredestroyexample;

import gladzik.eduardo.postconstructpredestroyexample.dao.ClientDAO;
import gladzik.eduardo.postconstructpredestroyexample.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PostconstructpredestroyexampleApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PostconstructpredestroyexampleApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Eduardo Gladzik"));

		System.out.println("Objeto ClientDAO: " + clientDAO);
		System.out.println("Objeto cliente: " + clientDAO.getClient());
	}
}

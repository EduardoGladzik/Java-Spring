package gladzik.eduardo.dependencyinjectionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionexampleApplication {

    public static void main(String[] args) {

        //Terceira maneira
        ApplicationContext applicationContext = SpringApplication.run(DependencyinjectionexampleApplication.class, args);

        Pet pet = applicationContext.getBean(Pet.class);
        pet.execute();

        //Segunda maneira
//		Pet pet1 = new Pet(new Cat());
//		pet.execute();
//
//		Pet pet2 = new Pet(new Dog());
//		pet.execute();

        //Primeira maneira
//		Pet pet = new Pet();
//		pet.execute();
    }

}

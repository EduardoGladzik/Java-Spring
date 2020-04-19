package gladzik.eduardo.dependencyinjectionexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 16/04/2020 18:37
 */

@Component
public class Pet {

    //Terceira maneira
    @Autowired
    private gladzik.eduardo.dependencyinjectionexample.interfaces.iAnimal iAnimal;

    public void execute() {
        iAnimal.comunicar();
    }

    //Segunda maneira
//    public Pet(IAnimal iAnimal) {
//        this.iAnimal = iAnimal;
//    }

    //Primeira maneira
//      public void execute() {
//          iAnimal = new Cat(); //or Dog();
//          iAnimal.comunicar();
//      }
}

package gladzik.eduardo.dependencyinjectionexample.model;

import gladzik.eduardo.dependencyinjectionexample.interfaces.iAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 16/04/2020 18:37
 */

@Component
@Primary
@Qualifier("dog")
public class Dog implements iAnimal {

    @Override
    public void comunicar() {
        System.out.println("auauau");
    }
}

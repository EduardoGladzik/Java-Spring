package gladzik.eduardo.dependencyinjectionexample.model;

import gladzik.eduardo.dependencyinjectionexample.interfaces.iAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 16/04/2020 18:36
 */

@Component
@Qualifier("cat")
public class Cat implements iAnimal {

    @Override
    public void comunicar() {
        System.out.println("miauuu");
    }
}

package externalclasses;

import org.springframework.stereotype.Component;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 17/04/2020 14:53
 */

@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Conection JDBC!");
    }
}

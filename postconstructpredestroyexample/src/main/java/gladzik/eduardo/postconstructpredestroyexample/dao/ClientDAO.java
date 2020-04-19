package gladzik.eduardo.postconstructpredestroyexample.dao;

import gladzik.eduardo.postconstructpredestroyexample.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 16/04/2020 19:06
 */

@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstruct() {
        System.out.println("Objeto criado");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto finalizado");
    }
}

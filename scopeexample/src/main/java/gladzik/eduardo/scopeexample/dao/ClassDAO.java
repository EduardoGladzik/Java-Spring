package gladzik.eduardo.scopeexample.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 16/04/2020 19:18
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Getter @Setter
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;

}

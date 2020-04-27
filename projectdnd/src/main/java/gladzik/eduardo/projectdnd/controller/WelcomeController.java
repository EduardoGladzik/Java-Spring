package gladzik.eduardo.projectdnd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 23/04/2020
 */
@RestController
public class WelcomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the system!";
    }
}


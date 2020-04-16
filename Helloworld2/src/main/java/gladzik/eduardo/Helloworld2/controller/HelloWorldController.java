package gladzik.eduardo.Helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 15/04/2020
 */

@RestController
public class HelloWorldController {

    @GetMapping("/a")
    public String index() {
        return "Hello World";
    }
}
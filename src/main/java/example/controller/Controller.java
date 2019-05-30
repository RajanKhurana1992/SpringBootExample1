package example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/v1/")
public class Controller {

    @RequestMapping("welcome")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

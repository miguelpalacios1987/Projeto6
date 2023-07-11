package med.voll.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloCOntroller {
    @RequestMapping
    public String olaMundo(){

        return "Hello Word Spring!";

    }

}

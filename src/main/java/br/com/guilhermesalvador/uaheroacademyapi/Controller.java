package br.com.guilhermesalvador.uaheroacademyapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {
    @GetMapping("/health")
    public String healthCheck() {
        return "Status OK";
    }
}

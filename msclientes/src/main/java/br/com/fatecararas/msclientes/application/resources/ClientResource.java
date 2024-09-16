package br.com.fatecararas.msclientes.application.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientResource {

    @GetMapping
    public String hello() {
        return "Passou por este MicroService...";
    }
}

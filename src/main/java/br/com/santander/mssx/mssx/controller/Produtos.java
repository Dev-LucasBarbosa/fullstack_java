package br.com.santander.mssx.mssx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Produtos {
    @GetMapping("/api")
    public String HelloWorld(){
        return "Ola";
    }
}

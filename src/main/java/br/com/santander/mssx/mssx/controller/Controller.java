package br.com.santander.mssx.mssx.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cadastro/v1")
public class Controller {
    @GetMapping("/home")
    public String helloWorld(){
        return "hello";
    }

    }


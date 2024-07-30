package com.cursojava.curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* con agregar el deecorador se inporta lo demas de manera normal */
@RestController
public class UsuarioController {


    @RequestMapping (value = "prueba")
    public String prueba () {
        return "prueba";
    }
}

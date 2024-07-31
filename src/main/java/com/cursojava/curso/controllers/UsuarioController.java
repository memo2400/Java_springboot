package com.cursojava.curso.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* con agregar el deecorador se inporta lo demas de manera normal */
@RestController
public class UsuarioController {


    /* le agregue el termino list y despues importe la lista 
     * para arreglar el error
     */
    /*
    @RequestMapping (value = "prueba")
    public List<String> prueba () {
        // esta lista nos devuelve un JSON
        return List.of("manzana", "melon", "guayaba", "sandia");
    }*/
    @RequestMapping (value = "prueba")
    public String prueba () {
        // esta lista nos devuelve un JSON
        return "prueba";
    }
}

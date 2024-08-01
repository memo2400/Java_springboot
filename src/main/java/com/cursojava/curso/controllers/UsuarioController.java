package com.cursojava.curso.controllers;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

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
    
    // usamos el tipo Clase usuario, con las llaves {id} nuestro numero user es dinamico
    // es as que si hago http://localhost:8080/usuario/2222, el id 2222 se asigna al user

    @RequestMapping (value = "usuario/{id}")
    public Usuario obtenerUsuario (@PathVariable Long id) {
        
        // generamos el ususario
        
        Usuario usuario = new Usuario();

        //asignamos valores

        usuario.setNombre("Michael");
        usuario.setApellido("Hansen");
        usuario.setEmail("ejemplo@hotmail.com");
        usuario.setTelefono("5512344321");

        usuario.setId(id);

        return usuario;
    }

    @RequestMapping (value = "usuario")
    public List <Usuario> listaUsuarios (@PathVariable Long id) {
        
        // se crea un alista vacia de usuarios

        List <Usuario> usuarios  = new ArrayList<>();
        
        Usuario usuario = new Usuario();

        usuario.setNombre("Michael");
        usuario.setApellido("Hansen");
        usuario.setEmail("ejemplo@hotmail.com");
        usuario.setTelefono("5512344321");
        usuario.setId(id);


        Usuario usuario2 = new Usuario();

        usuario2.setNombre("Michael");
        usuario2.setApellido("Hansen");
        usuario2.setEmail("ejemplo@hotmail.com");
        usuario2.setTelefono("5512344321");
        usuario2.setId(id);

        Usuario usuario3 = new Usuario();

        usuario3.setNombre("Michael");
        usuario3.setApellido("Hansen");
        usuario3.setEmail("ejemplo@hotmail.com");
        usuario3.setTelefono("5512344321");
        usuario3.setId(id);

        // se agregan los usuarios

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
        
    }

    public Usuario editarUsuario () {
        
        Usuario usuario = new Usuario();

        usuario.setNombre("Michael");
        usuario.setApellido("Hansen");
        usuario.setEmail("ejemplo@hotmail.com");
        usuario.setTelefono("5512344321");

        return usuario;
    }

    public Usuario eliminarUsuario () {
        
        Usuario usuario = new Usuario();

        usuario.setNombre("Michael");
        usuario.setApellido("Hansen");
        usuario.setEmail("ejemplo@hotmail.com");
        usuario.setTelefono("5512344321");

        return usuario;
    }

    public Usuario buscarUsuario () {
        
        Usuario usuario = new Usuario();

        usuario.setNombre("Michael");
        usuario.setApellido("Hansen");
        usuario.setEmail("ejemplo@hotmail.com");
        usuario.setTelefono("5512344321");

        return usuario;
    }

}

package com.cursojava.curso.dao;

import java.util.List;

import com.cursojava.curso.models.Usuario;

/*
 * Con esto accesaremos a los datos
 * 
 * Es un archvio donde indicamos funciones debera contener una clase
 * Si las funciones no estan la clase no compila
 */


public interface UsuarioDao {

    /*
     * obtendemor una lista de clase usuarios invocnado a la clase
     * Usuario conroller
     */

    List<Usuario> obtenerUsuario ();
}

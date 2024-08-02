package com.cursojava.curso.dao;

import java.util.List;

import com.cursojava.curso.models.Usuario;

/*Aqui implementaremos la 
 * interface de UsuarioDao
 * 
 * se usa el termino "implements"
 * esto es un patron de diseño
 */

public class UsuarioDaoImple implements UsuarioDao {

    // el override es como un reemplazo
    @Override
    public List<Usuario> obtenerUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerUsuario'");
    }

}

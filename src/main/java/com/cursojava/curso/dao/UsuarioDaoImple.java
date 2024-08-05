package com.cursojava.curso.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cursojava.curso.models.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/* transaccional da la funcionalidad de armar consultas SQL a la BD  como transaccion
 * Repository = accede a repo de BD
*/

@Repository
@Transactional


/*Aqui implementaremos la 
 * interface de UsuarioDao
 * 
 * se usa el termino "implements"
 * esto es un patron de diseño
 */

public class UsuarioDaoImple implements UsuarioDao {

    // contexto en la BD a usar
    @PersistenceContext 
    
    // realiza la conexion a BD
    EntityManager EntityManager;

    // el override es como un reemplazo
    @Override
    public List<Usuario> obtenerUsuario() {

        /*
         * hacemos consulta con hibernate
         * sobre la clase
         */

        String consulta = "FROM usuario";

        //creo consulta.guardo en lista

        return EntityManager.createQuery(consulta).getResultList();
 
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'obtenerUsuario'");
    }

}

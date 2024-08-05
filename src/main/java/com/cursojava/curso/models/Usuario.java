package com.cursojava.curso.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// indicamos la tabla donse se guardara
@Table(name = "usuarios")

// hace referencia a una entidad de BD
@Entity 
public class Usuario {

    /*
     * decoradores de getter setter de lombok
     * hacen codigo en menos lineas
     */
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String apellido;

    @Getter @Setter
    private String email;
    @Getter @Setter
    private String telefono;

    @Getter @Setter
    private String password;
    @Getter @Setter
    private Long id;

    /* usaremos la convencion de getters y setters oara esta app
     * hay otros como builders que es otra convencion 
     * 
     * ya no usaremos getters y setters 
     */

    //  public String getNombre() {
    //     return nombre;
    // }
    // public void setNombre(String nombre) {
    //     this.nombre = nombre;
    // }
    // public String getApellido() {
    //     return apellido;
    // }
    // public void setApellido(String apellido) {
    //     this.apellido = apellido;
    // }
    // public String getEmail() {
    //     return email;
    // }
    // public void setEmail(String email) {
    //     this.email = email;
    // }
    // public String getTelefono() {
    //     return telefono;
    // }
    // public void setTelefono(String telefono) {
    //     this.telefono = telefono;
    // }
    // public String getPassword() {
    //     return password;
    // }
    // public void setPassword(String password) {
    //     this.password = password;
    // }
    // public Long getId() {
    //     return id;
    // }
    // public void setId(Long id) {
    //     this.id = id;
    // }


    

}

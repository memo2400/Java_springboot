package com.cursojava.curso.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// indicamos la tabla donse se guardara
@Table(name = "usuarios")

// hace referencia a una entidad de BD
@Entity 

@EqualsAndHashCode @ToString
public class Usuario {

    /*
     * decoradores de getter setter de lombok
     * hacen codigo en menos lineas
     *  @Column(name = "id") // aqui hacemos referencia a donde se insertara la info
     */
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "apellido")
    private String apellido;

    @Getter @Setter @Column(name = "email")
    private String email;
    @Getter @Setter @Column(name = "telefono")
    private String telefono;

    @Getter @Setter @Column(name = "password")
    private String password;
    @Getter @Setter @Column(name = "id")
    @Id // agregamos ID de jakarta
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

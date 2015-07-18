package com.example.jeampierre.titanicshop.daogenerator;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CLIENTE.
 */
public class Cliente {

    private Long id;
    /** Not-null value. */
    private String nombre;
    /** Not-null value. */
    private String apellidos;
    /** Not-null value. */
    private String correo;

    public Cliente() {
    }

    public Cliente(Long id) {
        this.id = id;
    }

    public Cliente(Long id, String nombre, String apellidos, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getNombre() {
        return nombre;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Not-null value. */
    public String getApellidos() {
        return apellidos;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /** Not-null value. */
    public String getCorreo() {
        return correo;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

}

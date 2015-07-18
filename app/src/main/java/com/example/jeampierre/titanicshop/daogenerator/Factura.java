package com.example.jeampierre.titanicshop.daogenerator;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table FACTURA.
 */
public class Factura {

    private Long id;
    /** Not-null value. */
    private String nombrecliente;
    private double preciototal;
    private String fecha;

    public Factura() {
    }

    public Factura(Long id) {
        this.id = id;
    }

    public Factura(Long id, String nombrecliente, double preciototal, String fecha) {
        this.id = id;
        this.nombrecliente = nombrecliente;
        this.preciototal = preciototal;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getNombrecliente() {
        return nombrecliente;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public double getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(double preciototal) {
        this.preciototal = preciototal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}

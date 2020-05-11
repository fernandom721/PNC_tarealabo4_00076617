package com.uca.capas.domain;

import javax.validation.constraints.*;

public class Producto {
    @Size(message = "El nombre no debe e tener mas de 15 caracteres", max=15)
    @NotEmpty(message = "Este campo no puede estar vacio")
    private String nombre;
    @Size(message = "El nombre no debe e tener mas de 15 caracteres", max=30)
    @NotEmpty(message = "Este campo no puede estar vacio")
    private String descripcion;
    @NotNull(message = "Ingrese el precio del prodcuto")
    @Min(value = 0, message = "El precio no debe de ser negativo")
    private int precio;
    @NotEmpty(message = "Este campo no puede estar vacio")
    @Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message = "el formato debe ser dd/mm/yyyy")
    private String fvencimiento;

    public Producto(){}

    public Producto(String nombre, String descripcion, int precio, String fvencimiento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fvencimiento = fvencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFvencimiento() {
        return fvencimiento;
    }

    public void setFvencimiento(String fvencimiento) {
        this.fvencimiento = fvencimiento;
    }
}

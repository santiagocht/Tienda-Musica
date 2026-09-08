/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santiagocht.tiendademusica;
/**
 *
 * @author chapa
 */
public class Producto{
    private int codigo;
    private String nombre;
    private int precio;
    private int cantidadDisponible;

    public Producto(int codigo, String nombre, int precio, int cantidadDisponible){
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setCantidadDisponible(cantidadDisponible);
    }

    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getPrecio() { return precio; }
    public int getCantidadDisponible() { return cantidadDisponible; }

    public void setPrecio(int precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor a 0.");
        }
    }

    public void setCantidadDisponible(int cantidad) {
        if (cantidad >= 0) {
            this.cantidadDisponible = cantidad;
        } else {
            System.out.println("La cantidad disponible no puede ser negativa.");

}
}
}

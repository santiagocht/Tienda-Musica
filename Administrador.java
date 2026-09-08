/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santiagocht.tiendademusica;
/**
 *
 * @author chapa
 */
public class Administrador {
    private String nombre;


    public Administrador(String nombre) {
        this.nombre = nombre;
    }


    public void cambiarPrecioProducto(Producto producto, int nuevoPrecio){
        producto.setPrecio(nuevoPrecio);
        System.out.println("precio cambiado");
    }

    public void cambiarCantidad(Producto producto, int nuevaCantidad){
        producto.setCantidadDisponible(nuevaCantidad);
        System.out.println("cantidad actualizada");
    }
}
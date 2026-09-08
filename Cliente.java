/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santiagocht.tiendademusica;
/**
 *
 * @author chapa
 */
public class Cliente{
    private String nombreCliente;
public Cliente(String nombreCliente){
    this.nombreCliente=nombreCliente;
}
public void consultarProductos(Producto productoConsultar){
    System.out.println("Precio: "+productoConsultar.getPrecio());
    System.out.println("Cantidad disponible: "+ productoConsultar.getCantidadDisponible());
}
}
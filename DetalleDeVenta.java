/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santiagocht.tiendademusica;
/**
 *
 * @author chapa
 */
public class DetalleDeVenta {
     private Producto producto;
    private int cantidad;
    private int precioPagado; 
    private int Subtotal;
    
    public DetalleDeVenta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    
        this.precioPagado = producto.getPrecio(); 
    }

   
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public double getPrecioPagado() { return precioPagado; }

    public double getSubtotal() {
        return this.cantidad * this.precioPagado;
    }
}
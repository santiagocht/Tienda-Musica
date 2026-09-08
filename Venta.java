/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santiagocht.tiendademusica;
/**
 *
 * @author chapa
 */
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private Cliente cliente;
    private List<DetalleDeVenta> detalles;


    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.detalles = new ArrayList<>(); 
    }


    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadDisponible() >= cantidad) {
            DetalleDeVenta nuevoDetalle = new DetalleDeVenta(producto, cantidad);
            detalles.add(nuevoDetalle);
         
            int nuevoStock = producto.getCantidadDisponible() - cantidad;
            producto.setCantidadDisponible(nuevoStock);
            
            System.out.println("Producto agregado a la venta.");
        } else {
            System.out.println("No hay suficiente inventario.");
        }
    }


    public double calcularTotal() {
        double total = 0;
        for (DetalleDeVenta detalle : detalles) {
            total += detalle.getSubtotal(); 
        }
        return total;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.santiagocht.tiendademusica;

/**
 *
 * @author chapa
 */
public class TiendaDeMusica {
    public static void main(String[] args) {
        

        Administrador admin = new Administrador("Carlos");
        Cliente cliente = new Cliente("Santiago");
        
        Producto guitarra = new Producto(1, "Guitarra", 500, 10);
        Producto bateria = new Producto(2, "Batería", 1200, 5);

        System.out.println("Producto: " + guitarra.getNombre() + " | Precio: " + guitarra.getPrecio());

        System.out.println("ACTUALIZACION DE INVENTARIO");
        admin.cambiarPrecioProducto(guitarra, 550);
        System.out.println("Nuevo precio de la guitarra: " + guitarra.getPrecio());
                
        System.out.println("REGISTRANDO LA VENTA");
        Venta venta1 = new Venta(cliente);
       
        venta1.agregarProducto(guitarra, 1); 
        venta1.agregarProducto(bateria, 1);  

        System.out.println("Total a pagar por la venta: " + venta1.calcularTotal());


        System.out.println("ELIMINANDO LA VENTA");
        

        venta1 = null; 
        System.out.println("La venta y sus detalles han sido eliminados.");

        System.out.println("VERIFICACION DESPUES DE BORRAR");
        cliente.consultarProductos(guitarra);
        System.out.println("El cliente sigue en el sistema.");
        System.out.println("Stock restante de la guitarra: " + guitarra.getCantidadDisponible());
    }
}
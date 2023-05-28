package com.tema2;

public class PrecioMasIva {
    public static void main(String[] args) {

        double precio = 100.0;
        double precioConIva = calcularPrecioConIva(precio);
        System.out.println("El precio con IVA es " + precioConIva + " pesos");


    }

    public static double calcularPrecioConIva(double precio) {
        double iva = 0.21;
        double precioConIva = precio + (precio * iva);
        return precioConIva;


    }
}



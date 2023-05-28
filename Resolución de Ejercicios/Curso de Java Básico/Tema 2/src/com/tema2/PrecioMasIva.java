package com.tema2;

import java.util.Scanner;

public class PrecioMasIva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int precio = scanner.nextInt();
        double precioConIva = calcularPrecioConIva(precio);
        System.out.println("El precio con IVA es " + precioConIva + " pesos");


    }

    public static double calcularPrecioConIva(double precio) {
        double iva = 0.21;
        double precioConIva = precio + (precio * iva);
        return precioConIva;


    }
}



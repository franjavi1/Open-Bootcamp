package poo.clases;

/**
 *Clase Base o superclase.
 */

public class SmartDevice {

    private String fabricante;
    private String modelo;

    public SmartDevice(){}

    public SmartDevice(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    public void mostrarInfo(){
        System.out.println("El fabricante es "+fabricante);
        System.out.println("El modelo es "+modelo);
    }



}



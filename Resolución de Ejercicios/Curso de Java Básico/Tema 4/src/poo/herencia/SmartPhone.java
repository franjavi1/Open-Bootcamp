package poo.herencia;


import poo.clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    String sistemaOperativo;
    int capacidad;

    public SmartPhone(){

    }

    public SmartPhone(String fabricante, String modelo, String sistemaOparativo, int capacidadd) {
        super(fabricante, modelo);
        this.sistemaOperativo = sistemaOparativo;
        this.capacidad = capacidadd;
    }

        public void mostrarInfo(){
            super.mostrarInfo();
            System.out.println("El sistema operativo es "+ sistemaOperativo);
            System.out.println("La capacidad es de "+ capacidad);




        }




    }








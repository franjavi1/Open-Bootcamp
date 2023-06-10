package poo.herencia;

import poo.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    String sistemaOperativo;
    String mallaMaterial;

    public SmartWatch(){}

    public SmartWatch(String fabricante, String modelo, String sistemaOperativo, String mallaMaterial) {
        super(fabricante, modelo);
        this.sistemaOperativo = sistemaOperativo;
        this.mallaMaterial = mallaMaterial;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("El sistema operativo es "+ sistemaOperativo);
        System.out.println("El material de malla  es de "+ mallaMaterial);

    }
}

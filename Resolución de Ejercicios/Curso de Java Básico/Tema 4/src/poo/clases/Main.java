package poo.clases;

import poo.herencia.SmartPhone;
import poo.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartPhone telefono1 = new SmartPhone("Notorola","G20","Andoroid",20);
        telefono1.mostrarInfo();

        SmartWatch reloj1 = new SmartWatch("Apple", "series 8","IOS","metal");
        reloj1.mostrarInfo();





    }


}

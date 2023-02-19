public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente();
        cliente.edad = 40;
        cliente.nombre="Juan";
        cliente.telefono = "555-5555";
        cliente.credito = 10000;

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad =30;
        trabajador.nombre ="Juan";
        trabajador.telefono="444-4444";
        trabajador.salario = 200000;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);




    }
}
class Persona{
    int edad;
    String nombre;
    String telefono;
}
class Cliente extends Persona{

    int credito;

}
class Trabajador extends Persona{

    int salario;

}






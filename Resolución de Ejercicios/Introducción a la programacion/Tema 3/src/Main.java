public class Main {
    public static void main(String[] args) {
       //Primer parte ------------------
        int resultado = 0;
        resultado = suma(10, 20, 50);
        System.out.println("La suma de los numeros es "+resultado);
      //Segunda parte ---------------------
        Coche miCoche = new Coche();

        miCoche.incPuertas();

        System.out.println("El número de puertas es "+miCoche.puertas);
    }
    //funcion suma 1º parte
    public static int suma(int a, int b, int c) {

        return a+b+c;
    }

}

    //Clase coche 2º parte

    class Coche {

     public int puertas = 4;

        public void incPuertas() {
        this.puertas++;

        }
    }

public class Main {
    public static void main(String[] args) {
        //if , if else , else
        int numeroif = -2;
        if (numeroif > 0) {
            System.out.println("Es positivo");
        } else if (numeroif < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("Es igual a 0");

        }
        // while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El valor de la variable numeroWhite es " + numeroWhile);

        }
        // Do while
        int numeroDoWhile = 0;

        do {
            numeroDoWhile++;
            System.out.println("valor de la variabla numeroDoWhile es " + numeroDoWhile);
        }

        while (numeroDoWhile < 1);

        // for

        var numeroFor = 0;
        for (int i = 0; i < 3; i++) {
            numeroFor++;
            System.out.println("El valor de la variabla numeroFor es " + numeroFor);

        }

        //swicht


        var estacion = "invierno";
        switch (estacion){
            case "otoño":
            System.out.println("Estamos en " + estacion);
            break;
            case "invierno":
            System.out.println("Estamos en " + estacion);
            break;
            case "primavera":
            System.out.println("Estamos en " + estacion);
            case "verano":
            System.out.println("Estamos en " + estacion);
            break;
            default:
            System.out.println("No es una estacion " + estacion);

    }





    }
}
package com.Tema3;

public class ContecanarTextos {

    public static void main(String[] args) {

        String[] nombres = new String[] {"Juan", "José", "Javier", "Francisco"};

        String SumadeNombres = "";

        for ( int i = 0; i < nombres.length; i++) {

            SumadeNombres += nombres[i] + " ";


        }
        System.out.println(SumadeNombres);
    }

}

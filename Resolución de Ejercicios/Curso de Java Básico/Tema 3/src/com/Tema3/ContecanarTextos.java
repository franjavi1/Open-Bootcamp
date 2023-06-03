package com.Tema3;

public class ContecanarTextos {

    public static void main(String[] args) {

        String[] nombres = {"Juan", "José", "Javier", "Francisco"};

        String SumadeNombres = "";

        for (String nombre : nombres) {

            SumadeNombres += nombre + " ";


        }
        System.out.println(SumadeNombres);
    }

}

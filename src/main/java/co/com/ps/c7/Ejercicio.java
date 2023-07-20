package co.com.ps.c7;

//Dado un arreglo {4,2,6,2,3,5} ordenar de menor a mayor

import java.util.Arrays;

public class Ejercicio {

    public static void main(String[] args) {

        int[] numeros = new int[6];
        numeros[0] = 4;
        numeros[1] = 2;
        numeros[2] = 6;
        numeros[3] = 2;
        numeros[4] = 3;
        numeros[5] = 5;

        int vari = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 1; j < (numeros.length - i); j++) {
                if (numeros[j - 1] > numeros[j]) {
                    vari = numeros[j - 1];
                    numeros[j - 1] = numeros[j];
                    numeros[j] = vari;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));

    }
}
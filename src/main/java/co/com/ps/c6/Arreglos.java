package co.com.ps.c6;

import java.util.ArrayList;
import java.util.List;

public class Arreglos {

    public static void main(String[] args) {

        //EJEMPLO 1 ARREGLO

        int[] MiPrimerArreglo = new int [2];
        System.out.print(MiPrimerArreglo[0]);
        MiPrimerArreglo[0]=10;
        System.out.print(MiPrimerArreglo[0]);

        int[] MiPrimerArreglo2 = {1,4,3,1000};

        //EJEMPLO 2 ARREGLO

        String [] nombres =new String [3];
        nombres [0]= "Juan";
        nombres [1]= "Maria";
        nombres [2]= "Carlos";

        System.out.print(nombres[0]);

        String[] apellidos = {"Lopez","Ramirez"};

        ///EJEMPLO LISTAS

        List<String> pais =new ArrayList<>();
        pais.add("paris");
        pais.add("EU");
        pais.add("Colombia");

        //   String[] apellidos = {"Lopez","Ramirez"};

        //EJEMPLO 3

        //  double [] notas =new double[] [3];
        //  notas [0]= 1.3;
        //     notas [1]= 1.5;
        //   notas [2]= 4.5;

        //    System.out.print("la nota del estudiante es:" +calcularNota(notas));

        //    public static double calcularNota (double[] notas){
        //   double acumulador=0;
        //    for (double nota:notas){
        //       acumulador=acumulador+nota;
    }
    //     return acumulador/notas.length;


}


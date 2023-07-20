package co.com.ps.c3;

import java.util.Scanner;

public class EjercicioEnClase {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();

        int suma= numero1+numero2;
        int resta= numero1-numero2;
        int multiplicacion= numero1*numero2;
        int division = numero1/numero2;

        System.out.println("El resultado de la suma es, "+suma);
        System.out.println("El resultado de la resta es, "+resta);
        System.out.println("El resultado de la multiplicacion es, "+multiplicacion);
        System.out.println("El resultado de la division es, "+division);


    }
}

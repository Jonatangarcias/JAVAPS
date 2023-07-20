package co.com.ps.c5;

import java.util.Scanner;

public class EjercicioEnClase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int yactual = 2023;
        int nacimiento;

        System.out.print("Digite su edad");
        int edad = scanner.nextInt();

        if(edad>18){
            System.out.println("Usted es Mayor de edad");
        }
        else{
            System.out.print("Usted es menor de edad");
        }

        nacimiento= yactual-edad;
        System.out.print("Su año de nacimiento es: " + nacimiento);




    }
}

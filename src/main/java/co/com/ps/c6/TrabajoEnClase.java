package co.com.ps.c6;

public class TrabajoEnClase {
    public static void main(String[] args) {

        //crear un arreglo con 10 numeros y encontrar el menor y el mayor de todos


        int [] numeros =new int[11];
        numeros [0]= 10;
        numeros [1]= 35;
        numeros [2]= 50;
        numeros [3]= 15;
        numeros [4]= 18;
        numeros [5]= 26;
        numeros [6]= 32;
        numeros [7]= 68;
        numeros [8]= 99;
        numeros [9]= 5;
        numeros [10]= 1;

        int mayor=numeros[0];
        int menor=numeros[0];


        for (int i = 1; i < numeros.length; i++) {


            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            System.out.println("El menor número es: " + menor);
            System.out.println("El mayor número es: " + mayor);
        }

    }
}


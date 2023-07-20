package co.com.ps.c5;

public class Class {

    public static void main(String[] args) {

        int num1 = 1;

        if(num1>3){ //SI
            System.out.println("el numero es mayor");
        }
        else if (num1==0){ //SINO SI
            System.out.println("el numero es 0");
        }
        else{ //SINO
            System.out.println("el numero es menor");
        }

//////////////////////////////SWITCH/////////////////////////////

        int diasemana = 2 ;

        switch (diasemana) {
            case 1:
                System.out.print("lunes");
                break;

            case 2:
                System.out.print("martes");
                break;

            case 3:
                System.out.print("miercoles");
                break;

            case 4:
                System.out.print("jueves");
                break;

            case 5:
                System.out.print("viernes");
                break;

            default:
                System.out.print("fin de semana");
                break;
        }

    }
}



package co.com.ps.c4;

import java.security.PublicKey;

class Persona {


    private String nombre;
    private String cargo;
    private int cedula;

    //DEFINIR CONSTRUCTOR PUBLICO
    //   public Persona(String nombre, String Cargo, int cedula) {
    //      this.nombre = nombre;
    //     this.cargo = cargo;
    //     this.cedula = cedula;
    // }


    //DEFINIR CLASES PRIVADAS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Persona (int cedula){
        this.cedula = cedula;
    }


}



package co.com.ps.c4;

class Repuestos {


    private String tipo;
    private String tamaño;
    private int codigo;


    public Repuestos(String tipo, String tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Repuestos(int codigo) {
        this.codigo = codigo;
    }
}



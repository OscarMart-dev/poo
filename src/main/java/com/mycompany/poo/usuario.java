
package com.mycompany.poo;

public class usuario {
    //declaración de variables segun el diagrama uml
    
    int codigo;
    String nombre;
    String apellido;
    String estcivil;
    String tipo;
    
//constructor
    public usuario(int codigo, String nombre, String apellido, String estcivil, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estcivil = estcivil;
        this.tipo = tipo;
        
    }
//getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstcivil() {
        return estcivil;
    }

    public void setEstcivil(String estcivil) {
        this.estcivil = estcivil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

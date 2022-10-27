
package com.mycompany.poo;

public class empleado {

//declaración de variables segun el diagrama uml
    
    //int codigo;
    String departamanto; 
    int seccion;
    int cod_despacho;

    //constructores

    public empleado(String departamanto, int seccion, int cod_despacho) {
        this.departamanto = departamanto;
        this.seccion = seccion;
        this.cod_despacho = cod_despacho;
    }
    
    
    //getters and setters 

    public String getDepartamanto() {
        return departamanto;
    }

    public void setDepartamanto(String departamanto) {
        this.departamanto = departamanto;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public int getCod_despacho() {
        return cod_despacho;
    }

    public void setCod_despacho(int cod_despacho) {
        this.cod_despacho = cod_despacho;
    }
 
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 * ----Lo que necesito para realizar el programa----
 *
 * @author gcetzal
 */
public class Tipos {

    private String tamano = "";
    private String nombre = "";
    private String lineasCodigo = "";
    private String tipo = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return (tamano);
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getLineasCodigo() {
        return lineasCodigo;
    }

    public void setLineasCodigo(String lineasCodigo) {
        this.lineasCodigo = lineasCodigo;
    }
  
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}

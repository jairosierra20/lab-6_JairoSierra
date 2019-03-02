/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_jairosierra;

import java.util.ArrayList;

/**
 *
 * @author Jairo Sierra
 */
public class Criaturas {
    private String nombre;
    private String cantidad;
    private String anos;
    private String region;
    private int vivas;
    private ArrayList<String> objetos = new ArrayList();

    public Criaturas(String nombre, String cantidad, String anos, String region, int vivas) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.anos = anos;
        this.region = region;
        this.vivas = vivas;
    }

    public Criaturas() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getAnos() {
        return anos;
    }

    public void setAnos(String anos) {
        this.anos = anos;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getVivas() {
        return vivas;
    }

    public void setVivas(int vivas) {
        this.vivas = vivas;
    }

    public ArrayList<String> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<String> objetos) {
        this.objetos = objetos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}

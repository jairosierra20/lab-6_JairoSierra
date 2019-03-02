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
public class Mundo_Disco {
    private String nombre;
    private ArrayList<Criaturas> criaturas = new ArrayList();

    public Mundo_Disco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Criaturas> getCriaturas() {
        return criaturas;
    }

    public void setCriaturas(ArrayList<Criaturas> criaturas) {
        this.criaturas = criaturas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}

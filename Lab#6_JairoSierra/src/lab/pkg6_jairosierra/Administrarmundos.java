/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_jairosierra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jairo Sierra
 */
public class Administrarmundos {
    private ArrayList<Mundo_Disco> listamundos = new ArrayList();
    private File archivo = null;
    public Administrarmundos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Mundo_Disco> getListamundos() {
        return listamundos;
    }

    public void setListamundos(ArrayList<Mundo_Disco> listamundos) {
        this.listamundos = listamundos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Administrarmundos{" + "listacriaturas=" + listamundos + '}';
    }
    public void setMundos_Dicos(Mundo_Disco p){
        this.listamundos.add(p);
    }
    public void escribirarchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
        fw = new FileWriter(archivo,false);
        bw = new BufferedWriter(fw);
        for (Mundo_Disco lista : listamundos) {
            bw.write(lista.getNombre()+";");
            for (int i = 0; i < lista.getCriaturas().size(); i++) {
                bw.write(lista.getCriaturas().get(i).getNombre()+",");
                bw.write(lista.getCriaturas().get(i).getCantidad()+",");
                bw.write(lista.getCriaturas().get(i).getAnos()+",");
                bw.write(lista.getCriaturas().get(i).getRegion()+",");
                bw.write(lista.getCriaturas().get(i).getVivas()+",");
                bw.write(lista.getCriaturas().get(i).getObjetos()+",");
            }
            bw.write(";");
        }
        bw.flush();
        }
        catch(Exception e){
            
        }
        bw.close();
        fw.close();
    }
        public void cargararchivo(){
        Scanner sc = null;
        listamundos=new ArrayList();
        if(archivo.exists()){
        try{
            sc=new Scanner(archivo);
            sc.useDelimiter(";");
            while(sc.hasNext()){
                listamundos.add(new Mundo_Disco(sc.next()));
                ArrayList<Criaturas> tem = listamundos.get(listamundos.size()-1).getCriaturas();
                Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while(s2.hasNext()){
                        tem.add(new Criaturas(s2.next(),s2.next(),s2.next(),s2.next(),s2.nextInt()));
                    }
                    listamundos.get(listamundos.size()-1).setCriaturas(tem);
            }
        }
        catch(Exception e){
            
        }
        sc.close();
        }
    }
}

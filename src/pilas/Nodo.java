/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author AMPARO
 */
public class Nodo {
    String nombre;//lista de objetos
        Nodo sig;//apuntador al siguiente nodo

           Nodo(){
            nombre= new String();
            sig=null;
        }
        
        Nodo(String x){
            nombre=x;
            sig=null;
        }

///metodos get y set
        
    public String getNombre() {
        return nombre;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}

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
public class Pila {
    Nodo pila;

    public void setPila(Nodo pila) {
        this.pila = pila;
    }

    public Nodo getPila() {
        return pila;
    }
    
   //<-----------metodos 
    
    public Nodo insertarPila(String nom, Nodo i){
        
        Nodo nuevoN= new Nodo(nom);//nodo nuevo 
        
        if (i== null){// n representa lista
            i= nuevoN;
        }else {
            i.setSig(insertarPila(nom, i.getSig()));
            //manda llamar al metodo y al a lista se se llama siguiente.
        }
        return i;
    }
    
    public String Mostrar(Nodo i){
        if (i.getSig()== null){
            return ("" + i.getNombre());
        }else{
            return (i.getNombre()+" "+ Mostrar(i.getSig()));
            
        }
    }
   
    public int  buscarValor(Nodo pila, String valor, int poinci, int contrador){
        if(pila==null){
            return-1;
        }else{
            if(contrador>=poinci){
                if (valor.equals(pila.getNombre())){
                    return contrador;
                }else{
                    contrador=buscarValor(pila.getSig(), valor, poinci, contrador+1);
                }
                   
            }else {
                contrador=buscarValor(pila.getSig(), valor, poinci, contrador+1);
            }
            return contrador;
        }
    }
    
    public String BuscarIndice(Nodo pila, int indice, int cont){
        if(pila==null){
            return "";
        }else{
                if(indice == cont){
                    return pila.getNombre();
                   
                 }else {
                    return BuscarIndice(pila.getSig(), indice, cont+1);
                 }
            }
    }
    
    public int contarPila(Pila pila){
        int elementos;
        int total=0;
        if (pila!=null){
          
        }else{
            total=0;
        }
        return total;
    }
        
    
    
}//class

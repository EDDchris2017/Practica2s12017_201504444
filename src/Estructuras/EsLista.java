/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Christian
 */
public class EsLista {
    
    protected Nodo inicio,fin;//Punteros para saber donde esta el inicio y el fin
    
    public EsLista(){
        inicio=null;
        fin=null;
    }
    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println(" ");
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+"]--->");
            recorrer = recorrer.siguiente;
        }
    }
    
}

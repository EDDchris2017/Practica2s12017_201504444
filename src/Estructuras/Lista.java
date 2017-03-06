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
public class Lista {
    
    protected Nodo inicio,fin;//Punteros para saber donde esta el inicio y el fin
    
    public Lista(){
        inicio=null;
        fin=null;
    }
    
    //Metodo para saber si la lista esta vacia
    public boolean estaVacia(){
        if (inicio==null) {
            return true;
        }else{
            return false;
        }
    }
    
    //Metodo para agregar un Nodo al inicio de la Lista
    public void agregarAlInicio(String elemento){
        //Creando al Nodo
        inicio = new Nodo(elemento, inicio);
        if (fin==null) {
            fin=inicio;
        }
    }
    //Metodo para insertar al final de la lista
    public void agregarAlFinal(String elemento){
        if (!estaVacia()) {
            fin.siguiente = new Nodo(elemento);
            fin = fin.siguiente;
        }else{
            inicio = fin = new Nodo(elemento);
        }
    }
            
    //Metodo para mostrar los datos
    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println(" ");
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+"]--->");
            recorrer = recorrer.siguiente;
        }
    }
    
    //Metodo para eliminar un Nodo del Inicio
    /*
    public int borrarDelInicio(){
        int elemento = inicio.dato;
        if (inicio==fin) {
            inicio = null;
            fin = null;
        }else{
            inicio = inicio.siguiente;
        }
        return elemento;
    }
        

    //Metodo para eliminar un Nodo del Final
    public int BorrarDelFinal(){
        int elemento = fin.dato;
        if (inicio==fin) {
            inicio = fin = null;
        }else{
            Nodo temporal = inicio;
            while(temporal.siguiente!=fin){
                temporal = temporal.siguiente;
            }
            fin = temporal;
            fin.siguiente = null;
        }
        return elemento;
    }
    */
    //Metodo para eliminar un Nodo en especifico
    public void eliminar(String elemento){
        if (!estaVacia()) {
            if (inicio==fin && elemento==inicio.dato) {
                inicio = fin = null;
            }else
                if (elemento== inicio.dato) {
                    inicio = inicio.siguiente;
                }else{
                    Nodo anterior, temporal;
                    anterior = inicio;
                    temporal = inicio.siguiente;
                    while(temporal!=null && temporal.dato!=elemento){
                        anterior = anterior.siguiente;
                        temporal = temporal.siguiente;
                    }
                    if (temporal!=null) {
                        anterior.siguiente = temporal.siguiente;
                        if (temporal==fin) {
                            fin = anterior;
                        }
                    }
                }
        }
    }
    
    //Metodo para buscar un Elemento
    public boolean estaEnLaLista(String elemento){
        Nodo temporal = inicio;
        while(temporal!=null && temporal.dato!=elemento){
            temporal = temporal.siguiente;
        }
        return temporal!=null;
    }
        
}

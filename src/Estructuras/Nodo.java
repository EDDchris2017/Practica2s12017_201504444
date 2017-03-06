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
public class Nodo {
    public String dato;
    public Nodo siguiente;//Puntero enlace
    
    //Constructor para insertar al final
    public Nodo(String d){
        this.dato = d;
        this.siguiente = null;
    }
    
    //Constructor para insertar al inicio
    public Nodo(String d, Nodo n){
        dato = d;
        siguiente = n;
    }
    
}

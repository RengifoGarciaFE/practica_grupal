/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Implements.LinkedSet;


/**
 *
 * @author fabio
 */
public interface LinkedSetInterface <E>{
    
    //Insertar
    public boolean insert (E elem);
    //extraer
    public boolean extract(E elem);
    //union
    public LinkedSet <E> union (LinkedSet <E> set);
    //intersecion devuelve el conjunto interseccion
    public LinkedSet <E> intersec (LinkedSet<E> set);
    //devuelve el numero de elementos
    public int theQuantity ();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author fabio
 */
public interface QueueInterface <E> {
    
    //añadir elemento
    public void add(E elem);
    
    //sacar el primero
    public E remove();
    
    //numero de elementos en la cola
    public int size();
    
    //si esta vacia
    public boolean isEmpty();
    
    //obretener el primero de la cola
    public E front();
    
    
}

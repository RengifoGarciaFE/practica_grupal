/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Interface.QueueInterface;

/**
 *
 * @author fabio
 * @param <E>
 */
public class LinkedQueue<E> implements QueueInterface <E> {
    
    private BinLinkedTreeNode front;
    private BinLinkedTreeNode end;
    private int length;
    
    public LinkedQueue(){
        front=null;
        end=null;
        length=0;
    }
    
    
    @Override
    public void add(E elem) {
        BinLinkedTreeNode newNode = new BinLinkedTreeNode(elem);
        if(this.isEmpty()==true){
            //añade cuando la lista esta vacia
            front = newNode;
            end= newNode;
        } else{
            //añade cuando ya exiten elementos en la lista
            end.next=newNode;
            end=newNode;
        }
        length++;
    }

    @Override
    public E remove() {
        
        if(this.isEmpty()==true){
            throw new IllegalStateException("la pila esta vacia");
        } 
        E elem = (E) front.info;
        front= front.next;
        if(front == null){
            end=null;
        }
        length--;
        return elem;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return (front==null);
    }

    @Override
    public E front() {
        if(this.isEmpty()== true){
            throw new IllegalStateException("la pila esta vacia");
        }
        return (E) front.info;
    }
    
}

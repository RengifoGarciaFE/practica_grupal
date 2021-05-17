/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

import Interface.LinkedSetInterface;

/**
 *
 * @author fabio
 */
public class LinkedSet <E> implements LinkedSetInterface<E>{

    private BinLinkedTreeNode head;
    int quantity;
    
    
    //Constructor
    public LinkedSet(){
    head=null;
    quantity=0;
    }
    
    
    
    @Override
    public boolean insert(E elem) {
        
        if(quantity!=0 && this.contains(elem)==false){//para añadir al final del conjunto si no esta vacio
        
            BinLinkedTreeNode temp = head;
                while(temp.next != null){
                temp=temp.next;
                }
            BinLinkedTreeNode newNode = new BinLinkedTreeNode(elem);    
            temp.next = newNode; 
            quantity++;
        
        } else if (quantity==0){//para crear un nodo en una lista vacía
        
            BinLinkedTreeNode newNode = new BinLinkedTreeNode(elem);
            head = newNode;   
            quantity++;
        } else if(this.contains(elem)==true){
            return false;
        }
        return true;
        
    }

    @Override
    public boolean extract(E elem) {
        BinLinkedTreeNode temp = head;
        BinLinkedTreeNode aux;
        if(this.contains(elem)==true && head.info == elem){
            aux=head;
            head = temp.next;
            quantity--;
            return true;
        } else if (this.contains(elem)==true && head.info!=elem){
            int auxCont=0;
            while(temp.next.info!=elem){
                temp=temp.next;
                auxCont++;
            }
        if(auxCont==quantity){
            temp.next = null;
        } else if(auxCont<quantity){    
        BinLinkedTreeNode del = temp.next;
        BinLinkedTreeNode aft = del.next;
        temp.next = aft;
        aux= del;
        del = null;
        }
        quantity--;
        
        return true;
        }
       return false; 
    }
    
     @Override
    public LinkedSet<E> union(LinkedSet<E> set2) {
        LinkedSet<E> auxSet= new LinkedSet<E>();
        BinLinkedTreeNode temp2=set2.head;
        while(temp2.next!=null){
            if(this.contains((E) temp2.info)==false){
                this.insert((E) temp2.info);
            }
            temp2=temp2.next;
        }
        this.insert((E) temp2.info);
        
        BinLinkedTreeNode temp = head;
        for(int i=0; i<quantity; i++){
            auxSet.insert((E) temp.info);
            temp=temp.next;
        }
        
        return auxSet;
    }

    @Override
    public LinkedSet<E> intersec(LinkedSet<E> set2) {
        LinkedSet<E> auxSet= new LinkedSet<E>();
        BinLinkedTreeNode temp=head;
        
        while(temp!=null){
            if(set2.contains((E) temp.info)){
                auxSet.insert((E) temp.info);
            }
            temp=temp.next;
        }
        
        head=null;
        
        return auxSet;
    }
    
    @Override
    public int theQuantity() {
        return quantity;
    }
    
    
    public boolean contains(E elem){
    BinLinkedTreeNode temp = head;
    boolean x=false;
    int cont=1;
    if(temp.info == elem){
                x = true;
            }
    while(cont !=quantity && x == false){
    temp=temp.next;
        if(temp.info == elem){
        x = true;
        }
    cont++;
    }
    return x;
    }

    
    
    
}

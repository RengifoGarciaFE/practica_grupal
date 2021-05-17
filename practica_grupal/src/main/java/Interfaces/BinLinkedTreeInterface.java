/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Implements.BinLinkedTreeFERG;

/**
 *
 * @author fabio
 * @param <E>
 */
public interface BinLinkedTreeInterface <E>{
    
    public boolean isEmpty();
    
    public E getRoot();
    
    public E setRoot(E elem);
    
    public BinLinkedTreeFERG<E> getLeftSon();
    
    public BinLinkedTreeFERG<E> getRightSon();
    
    public void insertLeftSon(E elem);
    
    public void insertRightSon(E elem);
    
    public boolean contains(E elem);
    
    public BinLinkedTreeFERG<E> searchElem(E elem);
    
    public E removeRoot();
    
    public boolean isLeaf();
    
    
    
}

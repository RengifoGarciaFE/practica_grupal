/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implements;

/**
 *
 * @author fabio
 * @param <E>
 */
public class BinLinkedTreeNode<E> {
    
    //datos
    private E info;
    private BinLinkedTreeFERG<E> leftSon;
    private BinLinkedTreeFERG<E> rightSon;
    private BinLinkedTreeFERG<E> parent;
    
    //constructor
    BinLinkedTreeNode(E elem){
        info = elem;
        leftSon = new BinLinkedTreeFERG<E>();
        rightSon = new BinLinkedTreeFERG<E>();
        parent = new BinLinkedTreeFERG<E>();
    }
    
    //getters y setters

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public BinLinkedTreeFERG<E> getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(BinLinkedTreeFERG<E> leftSon) {
        this.leftSon = leftSon;
    }

    public BinLinkedTreeFERG<E> getRightSon() {
        return rightSon;
    }

    public void setRightSon(BinLinkedTreeFERG<E> rightSon) {
        this.rightSon = rightSon;
    }

    public BinLinkedTreeFERG<E> getParent() {
        return parent;
    }

    public void setParent(BinLinkedTreeFERG<E> parent) {
        this.parent = parent;
    }

   
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_custom;

/**
 *
 * @author cyber
 * @param <T>
 */

public class node<T> {

    T data = null;
    node<T> next = null;

    public node(T data) {
        this.data = data;
    }
    
    public node() {
        this.data = null;
        this.next = null;
    }
    
    public boolean isNull(){
        return data == null;
    }
    public boolean isLastNode(){
        return next == null;
    }
    
}

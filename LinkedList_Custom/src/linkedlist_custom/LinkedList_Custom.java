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
public class LinkedList_Custom<T> {

    node<T> head = new node<>();
    int size = 0;

    public boolean insert(T data) {
            
        try{
            if (head.isNull()) {
                head.data = data;
            } else {
                node<T> targetNode = head;
                
                while (!targetNode.isLastNode()) {
                    targetNode = targetNode.next;
                }
                targetNode.next = new node<>(data);
            }
            size++;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    public void remove() {

    }

    public T get(int index) {
        if(this.size < index){
            System.out.println("Index out of lange");
            return null;
        }
        else{
            node<T> copyHead = head;
            while(index-- != 0){
                copyHead = copyHead.next;
            }
            return copyHead.data;
        }
    }

    public int size() {
        return this.size;
    }

    public void printList() {
        node<T> copyHead = head;
        System.out.println(copyHead.data);
        
        while(!copyHead.isLastNode()){
            copyHead = copyHead.next;
            System.out.println(copyHead.data);
            
        }
    }
}

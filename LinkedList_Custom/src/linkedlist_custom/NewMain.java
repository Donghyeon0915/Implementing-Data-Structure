/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_custom;

/**
 *
 * @author cyber
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList_Custom<Integer> list = new LinkedList_Custom<>();
        
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        
        list.printList();
    }
    
}

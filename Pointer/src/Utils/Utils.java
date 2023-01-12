/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

/**
 *
 * @author u8
 */
    class Utils {
        static class Node
    {
        int info;
        Node next;
        Node() {
            
        }
        Node (int x, Node p){
            info = x; next = p;
        }
    }
    
    class MyList
    {
        Node head, tail;
        MyList(){
            head = tail = null;
        }
        boolean isEmpty(){
            return (head == null);
        }
        void Clear(){
            head = tail = null;
        }
    }
}


import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmnhn
 */
public class List {

    Node head,tail;
    List() {
        head = tail = null;
    }

    boolean isEmpty() {
        return (head==null);
    }
    void clear() {
        head=tail=null;
    }
    public Phone inputPhone(int ID, String Name, double price, int amount, int year){
        Phone phone = new Phone(ID, Name, price, amount, year);
        return phone;
    }
    void add_First(Phone x) {
        if (isEmpty()) {
           head = tail = new Node(x, null);
       } else {
           Node q = new Node(x,null);
           head =q;
       }
    }
     void add_Last(Phone x) {
         if (isEmpty()) {
           head = tail = new Node(x,null);
       } else {
           Node q = new Node(x,null);
           tail.next = q;
           tail=q;
       }
    }
     void add_Node(Phone x, int PID) {
         Node newnode = new Node (x,null);
         if (isEmpty()) {
           head = tail = new Node( x,null);
         } else {
             Node tmp = head;
             while (tmp.next != null) {
                 //search phoneID
                 if (tmp.N_id==x.getID()) {
                     tmp.N_amount=x.amount;
                     tmp.N_id = x.ID;
                     tmp.N_name= x.Name;
                     tmp.N_year = x.year;
                 } else {
                     add_Last(x);
                 }
             }
         }
    }
    
      void show_list() {
        Node p =head; 
        while (p!= null) {
            System.out.print(p.N_amount+" "+p.N_year);
            p=p.next;
        }
        System.out.println();
    }
     
}

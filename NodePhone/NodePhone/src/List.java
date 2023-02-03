
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
     
     public void deleteFirst() {
            if (head != null) {
                head = head.next;
            }
        }

        public void deleteLast() {
            int count = 0;
            Node prevNode = null;
            Node lastNode = head;
            while (lastNode.next != null) {
                count++;
                prevNode = lastNode;
                lastNode = lastNode.next;
            }
            if (prevNode == null) {
                return;
            } else {
                prevNode.next = null;
                tail = prevNode;
            }
        }

        public void deleteNode(int PhoneID) {
            Node prevNode = null;
            Node currentNode = head;
            if (currentNode.N_id == PhoneID) {
                deleteFirst();
            }
            while (currentNode != null) {
                prevNode = currentNode;
                currentNode = currentNode.next;
                if (currentNode.N_id == PhoneID) {
                    currentNode = currentNode.next;
                    prevNode.next = currentNode;
                    break;
                }
            }
        }

        public boolean isExisting(int PhoneID) {
            Node currentNode = head;
            while (currentNode != null) {
                if (currentNode.N_id == PhoneID) {
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

        public int search(String name) {
            int count = 0;
            Node p = head;
            while (p != null) {
                if (p.N_name.equalsIgnoreCase(name)) {
                    count++;
                    break;
                }
                p = p.next;
            }
            return count;
        }

        public Node maxValue() {
            Node node = null;
            double valueMax = 0;
            Node currentNode = head;
            while (currentNode != null) {
                if (currentNode.N_price * currentNode.N_amount > valueMax) {
                    valueMax = currentNode.N_price * currentNode.N_amount;
                    node = currentNode;

                }
                currentNode = currentNode.next;
            }
            return node;
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

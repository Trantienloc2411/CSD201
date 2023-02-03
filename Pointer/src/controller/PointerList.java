
package controller;


import dto.I_Pointer;
import java.util.Scanner;

public class PointerList implements I_Pointer {
        public PointerList(){
        super();
    }

    Scanner sc = new Scanner(System.in);
        class Node
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


    MyList list = new MyList();
    @Override
    public void add_First(int x) {
        Node head = null, tail;
        System.out.print("Enter a value: ");
        x = sc.nextInt();
                
        if(list.isEmpty()){
            head = tail = new Node(x, null);
            System.out.println("Add successfully!");
        }
        else{
            Node q = new Node(x, null);
            head = head.next;
            q = head;
            System.out.println("Add successfully!");
        }
        
    }

    @Override
    public void add_Last(int x) {
        Node head, tail = null;
        System.out.print("Enter a value: ");
        x = sc.nextInt();
        if(list.isEmpty()){
            head = tail = new Node(x, null);
        }
        else{
            Node q = new Node(x, null);
            tail = tail.next;
            q.next = null;
        }
    }

    @Override
    public void add_Index(int x, int index) {
        Node head = null, tail = null;
        Node p = head;
        int pos = 1;
        System.out.print("Enter pos: ");
        index = sc.nextInt();
        System.out.print("Enter a value: ");
        x = sc.nextInt();
        if(list.isEmpty()){
            head = tail = new Node(x, null);
        }
        else{
            Node q = new Node(x, null);
            while(pos == index){
               p = p.next;
               pos++;
            }
            q.next = p.next;
            p.next = q;
        }
    }

    @Override
    public void delete_First() {
        Node head = null, tail = null;
        if(list.isEmpty()){
            System.out.println("Cant removed!");
        }
        else{
            head = head.next;
        }
    }

    @Override
    public void delete_Last(int x) {
        Node head = null, tail = null;
        int pos = 1;
        if(list.isEmpty()){
            System.out.println("Cant removed!");
        }
        else{
            Node q = new Node();
            //traverse the list
            while(q == tail){
                pos++;            
            }
            // if the list has only 1 element then remove that element
            if (pos < 2){
                list.Clear();
                System.out.println("Remove successfull!");
            }
            // the last
            else{
                while(q.next.next == null){
                    if(q.next == tail){
                        tail = q;
                    }
                    q = q.next;
                }
                System.out.println("Remove successfully");
            }
        }
    }

    @Override
    public void delete_Node(int index) {
        Node head = null, tail = null;
        Node p = head;
        int pos = 1;
        if(list.isEmpty()){
            System.out.println("Cant removed!");
        }
        else{
            Node q = new Node();
            //traverse the list
            while(q == tail){
                pos++;            
            }
            // if the list has only 1 element then remove that element
            if (pos < 2){
                list.Clear();
                System.out.println("Remove successfull!");
            }
            // the last
            else{
                for(int i = 0; i < index; i++){
                    if(i == index-1){
                        p.next = p.next.next;
                    }
                }

                System.out.println("Remove successfully");
            }
        }
    }

    //search node by value 
    @Override
    public void search_Node(int x) {
        Node head = null, tail = null;
        Node p = head;
        int pos = 1;
        if(list.isEmpty()){
            System.out.println("List is Empty!");
        }
        else{
            Node q = new Node();
            
        }
    }

    @Override
    public void show_List(int x) {
       
    }

    @Override
    public void update_Note(int x, int index) {
       
    }

    @Override
    public void insert_Behind(int x, int y) {
       
    }
    
}

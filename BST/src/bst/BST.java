/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author f1nn
 */
public class BST {

    class Node {

        Object h;
        int info;
        Node left, right;
        Node next;

        public Node(int x, Node p) {
            info = x;
            next = p;
        }

        Node(int x) {
            this.info = x;
            left = right = null;
        }

        public Node(Object t, Node p) {
            h = t;
            next = p;
        }

        public Node(Object t) {
            this(t, null);
        }
    }

    class MyQueue {

        protected Node head, tail, next;

        public MyQueue() {
            head = tail = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        Object front() throws Exception {
            if (isEmpty()) {
                throw new Exception();
            }
            return head.info;
        }

        public Object dequeue() throws Exception {
            if (isEmpty()) {
                throw new Exception();
            }
            int x = head.info;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return x;
        }

        void enqueue(Object x) {
            if (isEmpty()) {
                head = tail = new Node(x);
            } else {
                tail.next = new Node(x);
                tail = tail.next;
            }
        }

    }

    /* 
    class Node
    {   int info;
        Node left,right;
        Node(int x) { }
        Node(int x, Node p, Node q)
          {
            info=x;left=p; right=q;
          }  
        Node(int x)
         {
            this(x,null,null);
         }  
    }
    
    */
    Node root;

    BST() {
        root = null;
    }

    void insert(int x) {
        //check if root is empty or not
        if (root == null) {
            root = new Node(x);
        } else {
            Node f, p;
            p = root;
            f = null;
            //Check this value existed in tree or not
            while (p != null) {
                if (p.info == x) {
                    System.out.println("This value existed! No insertion");
                    return;
                }
                f = p;
                if (x < p.info) {
                    p = p.left;
                } else {
                    p = p.right;
                }
            }
            if (x < f.info) {
                f.left = new Node(x);
            } else {
                f.right = new Node(x);
            }

        }
    }

    void visit(Node p) {
        System.out.print(p.info + " | ");
    }

    int height(Node p) {
        if (root == null) {
            return 0;
        } else {
            int h_left = 0, h_right = 0;
            if (p.left != null) {
                h_left = height(p.left);
            } else if (p.right != null) {
                h_right = height(p.right);
            }
            int max = (h_left > h_right) ? h_left : h_right;
            return (max + 1);
        }
    }

    void breadth() {
        Queue<Node> q = new LinkedList<>();
        if (root != null) {
            q.add(root);
        }
        while (!q.isEmpty()) {
            Node p = q.remove();
            visit(p);
            if (p.left != null) {
                q.add(p.left);
            }
            if (p.right != null) {
                q.add(p.right);
            }
        }
    }

    void preOrder(Node p) {
        if (p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        }
        preOrder(p.left);
        visit(p);
        preOrder(p.right);
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        }
        preOrder(p.left);
        preOrder(p.right);
        visit(p);
    }
// search by value

    Node search(int x) {
        Node p = root;
        if (root == null) {
            return null;
        } else {
            while (p != null) {
                if (p.info == x) {
                    System.out.println("Found!");
                    return p;
                } else {
                    if (x < p.info) {
                        p = p.left;
                    } else if (x > p.info) {
                        p = p.right;
                    }
                }
            }
            return null;
        }
    }

    //Left
    void deleteByMerging(int x) {
        if (root == null) {
            System.out.println("Nothing to delete!");
        } else {
            Node r = search(x);
            Node p = search(x);
            if (r.right != null) {
                p = p.left;
                while (p.right != null) {
                    p = p.right;
                }
                p.right = r.right;
                r = r.left;
            }
            System.out.println("Remove successfull");
        }
    }
    
    void deletebyCopying(int x){
        if (root == null){
            System.out.println("Nothing to delete!");
        }
        else{
            Node p = search(x);
            Node r = search(x);
            if(r.left == null){
                r = r.right;
            }
            else if(r.right == null){
                r = r.left;
            }
            else{
                p = p.left;
                while(p.right != null)
                {
                    p = p.right;
                }
                r = p;
                p = null;
            }
            System.out.println("Remove successfull!");
        }
    }
    
}

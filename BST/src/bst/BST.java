/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

/**
 *
 * @author f1nn
 */
public class BST {

    class Node {

        int info;
        Node left, right;

        Node(int x) {
            this.info = x;
            left = right = null;
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
    void visit(Node p){
        System.out.print(p.info + " | ");
    }
    int height(Node p){
        if(root == null){
            return 0;
        }
        else{
            int h_left = 0, h_right = 0;
            if(p.left != null){
                h_left = height(p.left);
            }
            else if(p.right != null){
                h_right = height(p.right);
            }
            int max = (h_left > h_right) ? h_left : h_right;
            return (max + 1);
        }
        
    }

}

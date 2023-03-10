package bst;
public class Main {
    public static void main(String[] args) {
        BST b = new BST();
        b.insert(4);
        b.insert(7);
        b.insert(5);
        b.insert(9);
        b.insert(1);
        b.insert(3);
        b.insert(0);
        b.insert(2);
        b.breadth();
        System.out.println(b.height(b.root));
        b.breadth();
        b.search(5);
        b.inOrder(b.root);
        System.out.println("");
        b.preOrder(b.root);
        System.out.println("");
        b.postOrder(b.root);
        b.breadth();
        
    }
}

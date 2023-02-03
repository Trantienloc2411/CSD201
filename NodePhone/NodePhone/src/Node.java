/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmnhn
 */
public class Node {
    //declare
    public Node next;

    //Node data
    int N_id, N_amount, N_year;
    double N_price;
    String N_name;

//Constructor
    Node() {
    }

    Node(Phone info, Node p_next) {
        this.N_id = info.ID;
        this.N_name = info.Name;
        this.N_price = info.price;
        this.N_amount = info.amount;
        this.N_year = info.year;

        this.next = next;
    }
}

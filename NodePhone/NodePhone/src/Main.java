/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmnhn
 */
public class Main {
    public static void main(String[] args) {
        List list = new List();
        Node node = new Node();
        Phone phone = new Phone();
        
        //              id, name,price,amount,year
        phone = list.inputPhone(1, "iporn", 12, 12, 2022);
        list.add_First(phone);
        
        list.show_list();
    }
}

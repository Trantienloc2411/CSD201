/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lmnhn
 */
public interface I_List {
    void add_First(int x);

    void add_Last(int x);

    void add_Index(int x,int index);

    void delete_Last();

    void delete_First();

    // delete node la delete theo x = value
    void delete_node(int x);

    //delete x= index
    void delete_index(int index);
    
    void search_node(int x);

    void show1();
    
    void show2();

    void update_node(int index,int x);
    
    void insert_before(int x, int y);
    
    void sort();
    
    void clear();
    
}
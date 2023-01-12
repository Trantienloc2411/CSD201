package dto;
public interface I_Pointer {
    void add_First(int x);
    void add_Last(int x);
    void add_Index(int x, int index);
    void delete_First();
    void delete_Last(int x);
    void delete_Node(int index);
    void search_Node(int x); //by index
    void show_List(int x);
    void update_Note(int x, int index);
    void insert_Behind(int x, int y); // insert value user input behind the value user find
    
}


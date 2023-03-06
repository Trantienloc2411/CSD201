package SinglyLinkedList;

class Node {

    float info;
    Node next;

    Node() {
    }

    Node(float f_data, Node n_data) {
        info = f_data;
        next = n_data;
    }
}

class Stu_list {

    Node p_head, p_tail;
    int size;

    Stu_list() {
        p_head = p_tail = null;
    }

    boolean isEmpty() {
        return (p_head == null);
    }

    void clear() {
        p_head = p_tail = null;
    }

    public class Functions {

        // Hiển thị toàn node trong list
        void show() {
            if (isEmpty()) {
                System.out.println("Nothing to show!!!");

            } else {
                Node q;
                q = p_head;
                while (q != null) {
                    System.out.print(q.info + " | ");
                    q = q.next;
                }
                System.out.println();
            }
        }

        //Thêm đầu  <-- Ý tưởng là Nối node mới tạo vào Head sau đó di chuyển con trỏ head đến Node mới
        void addFirst(float gpa) {
            if (isEmpty()) {
                p_head = p_tail = new Node(gpa, null);
            } else {
                Node q = new Node(gpa, null);
                q.next = p_head;
                p_head = q;
            }
        }

        // thêm cuối <-- Ý tưởng: Nối node tail đến node mới vừa tạo sau đó di chuyển con trỏ tail đến node mới tạo
        void addLast(float gpa) {
            if (isEmpty()) {
                p_head = p_tail = new Node(gpa, null);
            } else {
                Node q = new Node(gpa, null);
                p_tail.next = q;
                q = p_tail;
            }
        }

        //xoá đầu  <--Ý tưởng:  Di chuyển con trỏ head đến Node liền kề nó
        void deleteFirst() {
            if (isEmpty()) {
                System.out.println("Nothing to delete!");
            } else {
                p_head = p_head.next;
            }
        }

        // xoá cuối  <--Ý tưởng: Tạo một node tạm (q) duyệt đến khi q.next = tail thì đưa con trỏ về q
        void deleteLast() {
            if (isEmpty()) {
                System.out.println("Nothing to delete!");
            } else {
                if(p_head.next == null){
                    System.out.println("The list is empty");
                    return;
                }
                Node q = p_head;
                while (q != null) {
                    if (q.next == p_tail) {
                        p_tail = q;
                        q.next = null;
                    }
                    q = q.next;
                }

            }
        }

        // xoá node TH1: xoá tất cả Node chứa giá trị người dùng nhập vào (search giá trị của Node và xoá nó)
        void deleteNodebyValue(float gpa) {
            if (isEmpty()) {
                System.out.println("Nothing to delete!");
            }
            else{
                Node q = p_head;
                while(q!=null){
                    //Nếu gpa nhập vào ở vị trí đầu tiền thì xoá đầu
                    if(p_head.info == gpa){
                        deleteFirst();
                    }
                    //Nếu gpa nhập vào ở vị trí cuối cùng
                    else if(p_tail.info == gpa){
                        deleteLast();
                    }
                    //Trường hợp còn lại nằm trong khoảng đầu và cuối
                    else if(q.next.info == gpa){
                        q.next = q.next.next;
                    }
                    q = q.next;
                }
            }
        }
        //xoá node TH2: xoá node bằng index của node
        void deleteNodebyIndex(int index){
            if(isEmpty()){
                System.out.println("Nothing to delete!");
            }
            else{
                Node q = p_head;
                int i = 0;
                if(index == 0){
                    deleteFirst();
                }
                else{
                    //sử dụng vòng lặp để đi đến trước vị trí cần xoá
                    for(i = 0; q != null && i < index -1; i++){
                        q = q.next;
                    }
                    // trong trường hợp người dùng nhập vị trí ngoài Singly LinkedList
                    if (q == null || q.next == null){
                        return;
                    }
                    //thực hiện xoá bằng cách cho Node hiện tại nối với Node kề kề (.next.next)
                    q.next = q.next.next;
                }
            }
        }
        //Kiểm tra Node có trùng thông tin (info) hay không <-- Ý tưởng: Duyệt các Node trong list
        boolean isExisting(float gpa){
            if(isEmpty()){
                System.out.println("List is Empty");
                return false;
            }
            else{
                Node q = p_head;
                while(q!=null){
                    if(q.info == gpa){
                        return true;
                    }
                    q = q.next;
                }
                return false;
            }
        }
    }
}

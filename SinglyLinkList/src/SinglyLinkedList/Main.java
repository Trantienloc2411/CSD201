package SinglyLinkedList;

import java.util.Scanner;

import SinglyLinkedList.Stu_list.Functions;

public class Main {
    public static void main(String[] args) {
        int choice = 0,i;
        float num;
        Stu_list s = new Stu_list();
        Functions f = s.new Functions();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("This is the first version of Singly LinkedList (only using 1 value)");
            System.out.println("1. Show list");
            System.out.println("2. Add First");
            System.out.println("3. Add Last");
            System.out.println("4. Delete First");
            System.out.println("5. Delete Last");
            System.out.println("6. Delete Node (By Value)");
            System.out.println("7. Delete Node (by index)");
            System.out.println("8. Check is Existing");
            System.out.println("9. Remove All Node");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    f.show();
                    break;
                case 2:
                    System.out.println("Enter a number: ");
                    num = Float.parseFloat(sc.nextLine());
                    f.addFirst(num);
                    break;
                case 3:
                    System.out.println("Enter a number: ");
                    num = Float.parseFloat(sc.nextLine());
                    f.addLast(num);
                    break;
                case 4:
                    f.deleteFirst();
                    break;
                case 5:
                    f.deleteLast();
                    break;
                case 6:
                    System.out.println("Enter a number");
                    num = Float.parseFloat(sc.nextLine());
                    f.deleteNodebyValue(num);
                    break;
                case 7:
                    System.out.println("Enter a number");
                    i = Integer.parseInt(sc.nextLine());
                    f.deleteNodebyIndex(i);
                    break;
                case 8:
                    System.out.println("Enter a number");
                    num = Float.parseFloat(sc.nextLine());
                    if(f.isExisting(num)){
                        System.out.println("Existed!");
                    }
                    else{
                        System.out.println("Not Existed!");
                    }
                    break;
                case 9:
                    System.out.println("Remove all");
                    s.clear();
                    break;
                case 10:
                    System.out.println("Attention! This code may have some issues! If you have it, please created issues for me!");
                    System.out.println("Thanks");
                    System.exit(1);
                    sc.close();
            }
        } while (choice > 0 && choice < 11);
        sc.close();
    }
}

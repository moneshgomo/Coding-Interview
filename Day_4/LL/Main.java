package Day_4.LL;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.insertAtFirst(50);

        // list.deleteAtPosition(1);
        //list.deleteAtPosition(3);
       // list.deleteAtPosition(2);
       //list.deleteAtPosition(5);
       list.deleteAtPosition(4);
        list.display();

        // list.display();
        // System.out.println();
        // list.deleteAtFirst();
        // list.insertAtFirst(60);
        // list.display();

        // System.out.println();
        // list.insertAtLast(9);
        // list.insertAtLast(8);

        // list.display();
        // System.out.println();

        // list.deleteAtLast();
        // list.display();

        // System.out.println();
        // System.out.println("Below insert at position");
        // list.insertAtPosition(25, 3);
        // list.display();
        // System.out.println();
        // list.insertAtPosition(70, 1);
        // list.display();
        // System.out.println();
        // list.insertAtPosition(7, 9);
        // list.display();

        System.out.println();
       System.out.println(list.getLength());

    }
}
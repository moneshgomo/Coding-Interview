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

        list.display();
        System.out.println("\n");

        // list.insertAtLast(9);
        // list.insertAtLast(8);

        // list.display();
        // System.out.println("\n");

        // list.deleteAtPosition(1);
        // list.display();
        // System.out.println();

        // list.deleteAtPosition(3);
        // list.display();
        // System.out.println();

        // list.deleteAtPosition(2);
        // list.display();
        // System.out.println();

        // list.deleteAtPosition(5);
        // list.display();
        // System.out.println();

        // list.deleteAtPosition(4);
        // list.display();
        // System.out.println();

        // list.deleteAtFirst();
        // list.display();
        // System.out.println();

        // list.insertAtFirst(60);
        // list.display();
        // System.out.println();

        // list.deleteAtLast();
        // list.display();
        // System.out.println();

        // list.insertAtPosition(25, 3);
        // list.display();
        // System.out.println();

        // list.insertAtPosition(70, 1);
        // list.display();
        // System.out.println();

        // list.insertAtPosition(7, 9);
        // list.display();
        // System.out.println();

        // System.out.println("Length: " + list.getLength());

        // System.out.println();
        // System.out.println("============================");

        // boolean ans = list.search(22);
        // System.out.println(ans==true ?"Yes":"No");


        // System.out.println("============================");

        // System.out.println();
        // list.display();



        // System.out.println();

        // int position = list.findPosition(25);
        // System.out.print("Position : " + position);





    }
}
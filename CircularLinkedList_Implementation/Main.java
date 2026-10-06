package CircularLinkedList_Implementation;

public class Main {

    public static void main(String[] args) {

        CircularLinkedList list = new CircularLinkedList();

        // list.insertAtBegin(10);
        // list.insertAtBegin(20);
        // list.insertAtBegin(30);

        // System.out.println("Head: " + list.head.data);
        // System.out.println("Tail: " + list.tail.data);
        // System.out.println("Tail.next: " + list.tail.next.data);

        // list.insertAtLast(10);

        // list.insertAtLast(20);

        // list.insertAtLast(30);
        // list.insertAtLast(40);

        // System.out.println("Head: " + list.head.data);
        // System.out.println("Tail: " + list.tail.data);
        // System.out.println("Tail.next: " + list.tail.next.data);

        // list.display();

        // list.insertAtLast(10);
        // list.display();

        // list.insertAtLast(20);
        // list.insertAtLast(30);
        // list.insertAtLast(40);

        // list.display();

        // System.out.println("\nHead: " + list.head.data);
        // System.out.println("Tail: " + list.tail.data);
        // System.out.println("Tail.next == Head: " + (list.tail.next == list.head));

        // list.insertAtLast(10);
        // list.insertAtLast(20);
        // list.insertAtLast(30);
        // list.insertAtLast(40);

        // System.out.println("Before deletion:");
        // list.display();

        // list.deleteAtBegining();

        // System.out.println("\nAfter deletion:");
        // list.display();

        // System.out.println("\nHead: " + list.head.data);
        // System.out.println("Tail: " + list.tail.data);
        // System.out.println("Circular: " + (list.tail.next == list.head));

        //  list.insertAtLast(40);
        //  list.insertAtLast(30);
        // list.insertAtLast(20);
        // list.insertAtLast(10);

        /*
         * 1. Empty + position 1 [ pass ]
         * 2. Empty + position 2 [ pass ]
         * 3. One node + position 1 [ pass : Only one node in list and now list is empty]
         * 4. One node + position 2 [ pass : Invalid Position  ]
         * 5. Two nodes + position 1 [pass ]
         * 6. Two nodes + position 2 [ pass ]
         * 7. Two nodes + position 3
         * 8. Multiple nodes + middle
         * 9. Multiple nodes + last
         * 10. Invalid position 0
         * 11. Invalid position > size
         * 
         */

        // list.display();
        // System.out.println();
        // list.deleteAtPosition(2);
        // System.out.println();
        
        list.insertAtBegin(40);
        list.insertAtBegin(30);
        list.display();
        list.deleteAtPosition(3);
        System.out.println();
        list.display();

    }
}

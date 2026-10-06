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

        LinkedList list1 = new LinkedList();

        list1.insertAtFirst(3);
        list1.insertAtFirst(3);
        list1.insertAtFirst(2);
        list1.insertAtFirst(1);

        list1.insertAtFirst(1);

        list1.display();
        System.out.println();
        list1.deleteDuplicateNode();
        list1.display();

    }
}
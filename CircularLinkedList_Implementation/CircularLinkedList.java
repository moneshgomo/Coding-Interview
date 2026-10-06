package CircularLinkedList_Implementation;

public class CircularLinkedList {

    Node head;
    Node tail;

    CircularLinkedList() {
        head = tail = null;
    }

    void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            newNode.next = newNode;
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;

    }

    void insertAtPosition(int data, int position) {

        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (head == null && tail == null) {
            if (position == 1) {
                Node newNode = new Node(data);

                newNode.next = newNode;
                head = newNode;
                tail = newNode;

                return;
            }
        }

        if (position == 1) {
            insertAtBegin(data);
            return;
        }

        Node currentNode = head;

        Node newNode = new Node(data);

        for (int i = 1; i < position - 1; i++) {
            currentNode = currentNode.next;

            if (currentNode == head) {
                System.out.println("Invalid position");
                return;
            }
        }

        newNode.next = currentNode.next;
        currentNode.next = newNode;

        if (currentNode == tail) {
            tail = newNode;
        }

    }

    void deleteAtBegining() {

        if (head == null && tail == null) { // i know only checking head == null is enough but i like to code like this
                                            // that why
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            System.out.println("Only one node in list and now list is empty");
            return;
        }

        tail.next = head.next;
        head = head.next;
    }

    void deleteAtLast() {

        if (head == null && tail == null) {

            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            System.out.println("Only one node in list and now list is empty");
            return;
        }

        if (head.next == tail) {
            head.next = head;
            tail = head;
            return;
        }
        Node currentNode = head;

        while (currentNode.next != tail) {
            currentNode = currentNode.next;
        }

        currentNode.next = head;
        tail = currentNode;

    }

    void deleteAtPosition(int position) {

        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }

        if (head == null && tail == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) {
            deleteAtBegining();
            return;
        }

        Node currentNode = head;

        for (int i = 1; i < position - 1; i++) {

            if (currentNode.next == head) {
                System.out.println("Out of range");
                return;
            }

            currentNode = currentNode.next;
        }

        if (currentNode.next == head) {
            System.out.println("Out of range");
            return;
        }

        if (currentNode.next == tail) {
            deleteAtLast();
            return;
        }

        currentNode.next = currentNode.next.next;
    }

    void display() {

        Node currentNode = head;

        if (head == null && tail == null) {
            System.out.println("List is empty");

            return;
        }

        do {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

        while (currentNode != head);

    }

}

public class DoublyLinkedList {

    Node head;
    Node tail;

    void insertAtBegining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.previous = newNode;
        head = newNode;

    }

    void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
    }

    void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (position == 1) {
            insertAtBegining(data);
            return;
        }
        if (position == getLength() + 1) {
            insertAtLast(data);
            return;
        }

        if (position > getLength() + 1) {
            System.out.println("Out of Range");

        } else {

            for (int i = 1; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            newNode.previous = currentNode;
            currentNode.next.previous = newNode;
            currentNode.next = newNode;
            
        }

    }

    void deleteAtBegining() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            System.out.println("List contains only one node ");
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.previous = null;

    }

    void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            System.out.println("List contains only one node ");
            head = null;
            tail = null;
            return;
        }
        tail = tail.previous;
        tail.next = null;

    }

    void display(char direction) {

        char FORWARD = 'F';
        char BACKWARD = 'B';

        if (direction == FORWARD) {

            if (head == null) {
                System.out.println("List is empty ");
                return;
            }

            Node currentNode = head;

            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
            return;
        } else if (direction == BACKWARD) {
            Node currentNode = tail;

            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.previous;
            }
            System.out.println("null");

        }
    }

    int getLength() {
        Node currenNode = head;

        int length = 0;
        while (currenNode != null) {
            length++;
            currenNode = currenNode.next;
        }

        return length;
    }
}

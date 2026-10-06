public class DoublyLinkedList {

    Node head;
    Node tail;



    /*
Source : https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem?isFullScreen=true

       public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {

    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
    DoublyLinkedListNode currentNode = llist;

    if (llist == null || data < llist.data) {
        newNode.next = llist;

        if (llist != null) {
            llist.prev = newNode;
        }

        return newNode;
    }

    while (currentNode != null && currentNode.next != null) {

        if (currentNode.data <= data && currentNode.next.data >= data) {

            currentNode.next.prev = newNode;
            newNode.next = currentNode.next;
            newNode.prev = currentNode;
            currentNode.next = newNode;

            return llist;
        } 
        else {
            currentNode = currentNode.next;
        }
    }

    newNode.prev = currentNode;
    currentNode.next = newNode;

    return llist;
}
    
    */











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

            if (currentNode == tail) {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
                return;
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

    void deleteAtPosition(int position) {

        if (getLength() == 0 || getLength() - 1 < position || position <= 0) {
            System.out.println("Invalid Position or List is empty");
            return;
        }

        if (position == getLength() - 1) {
            deleteAtLast();
            return;
        }

        Node currentNode = head;

        if (position == 0) {

            currentNode.next.previous = null;
            head = currentNode.next;

            return;
        }


        if (head == tail) {
            head = tail = null;
            return;
        }

        for (int i = 0; i < position; i++) {
            currentNode = currentNode.next;
        }

        if(currentNode == tail){
            tail = tail.previous;
            tail.next =  null;
            return  ;
        }

        currentNode.previous.next = currentNode.next;
        currentNode.next.previous = currentNode.previous;
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
        }

        else if (direction == BACKWARD) {
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

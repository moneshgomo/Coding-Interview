import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int n) {
        data = n;
        next = null;
    }
}

class LinkedList {
    Node head = null;

    void insertAtBegin(int n) {
        Node newnode = new Node(n);
        newnode.next = head;
        head = newnode;
    }

    void insertAtEnd(int n) {
        Node newnode = new Node(n);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    void deleteAtBegin() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void insertAtAny(int pos, int n) {
        if (pos == 0) {
            insertAtBegin(n);
            return;
        }
        Node newnode = new Node(n);
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
            if (temp == null) {
                System.out.println("Out of Range");
                return;
            }
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void deleteAtAny(int pos) {
        if (pos == 0) {
            deleteAtBegin();
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
            if (temp == null || temp.next == null) {
                System.out.println("Deletion is not possible/out of range");
                return;
            }
        }
        temp.next = temp.next.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Singlelinkedlist {
    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insertAtEnd(25);
        list.insertAtBegin(23);
        list.insertAtBegin(18);
        list.deleteAtAny(5);
        list.display();
    }
}
package Queue_Implementation;

public class Queue {

    Node front;
    Node rear;

    Queue() {
        front = rear = null;
    }

    // 1. ENQUEUE → Add at rear
    void enqueue(int data) {

        Node newNode = new Node(data);

        if (front == null && rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {

        
        if (front == null && rear == null) {
            System.out.println("Queue is empty");
            return;
        }

        if (front == rear) {
            front = rear = null;
            return;
        }

        front = front.next;
    }

    void peek() {

        if (front == null && rear == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Front element: " + front.data);
    }

    void display() {

        if (front == null && rear == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node currentNode = front;

        while (currentNode != null) {

            System.out.print(currentNode.data + " ");

            currentNode = currentNode.next;
        }

        System.out.println();
    }

    boolean isEmpty() {

        return front == null && rear == null;
    }
}
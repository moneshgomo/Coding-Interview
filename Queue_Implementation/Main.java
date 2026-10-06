package Queue_Implementation;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.peek();

        queue.dequeue();

        queue.display();

        System.out.println(queue.isEmpty());
    }
}
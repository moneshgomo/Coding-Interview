public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        char FORWARD = 'F';
        char BACKWARD = 'B';


        list.insertAtBegining(50);
        list.insertAtBegining(40);
        list.insertAtBegining(30);
        list.insertAtBegining(20);
        list.insertAtBegining(10);
        System.out.println();
        list.display(FORWARD);

        list.insertAtPosition(25, 3);
        System.out.println();
        list.display(FORWARD);

        int n = list.getLength();
        System.out.println(n);

        list.display(BACKWARD);
    }
}

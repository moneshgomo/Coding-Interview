public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list1 = new DoublyLinkedList();

        char FORWARD = 'F';
        //char BACKWARD = 'B';

        
        list1.insertAtBegining(4);
     
        list1.insertAtBegining(2);
        list1.insertAtBegining(1);


        list1.display(FORWARD);

        list1.sortedInsert( 3);

        list1.display(FORWARD);

    }
}

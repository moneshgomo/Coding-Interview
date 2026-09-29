package Day_4.LL;

class LinkedList {

  Node head;

  void insertAtPosition(int data, int position) {

    if (position < 1 || position > getLength() + 1) {
      System.out.println("Invalid position");
      return;
    }
    Node newNode = new Node(data);
    Node currentNode = head;

    if (position == 1) {
      System.out.println("called() with data  : " + data + " Position : " + position);
      insertAtFirst(data);
      return;
    }

    for (int i = 1; i < position - 1; i++) {
      currentNode = currentNode.next;
    }

    newNode.next = currentNode.next;
    currentNode.next = newNode;

  }

  void insertAtFirst(int data) {

    Node newNode = new Node(data);

    newNode.next = head;

    head = newNode;

  }

  void insertAtLast(int data) {
    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        return;
    }

    Node currentNode = head;

    while (currentNode.next != null) {
        currentNode = currentNode.next;
    }

    currentNode.next = newNode;
}

  void deleteAtFirst() {

    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    head = head.next;

  }

  void deleteAtLast() {

    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    if (head.next == null) {
      head = null;
      return;
    }

    Node currentNode = head;

    while (currentNode.next.next != null) {
      currentNode = currentNode.next;
    }

    currentNode.next = null;
  }

  int getLength() {
    Node currentNode = head;
    int count = 0;

    while (currentNode != null) {
      count++;
      currentNode = currentNode.next;
    }

    return count;
  }

  void deleteAtPosition(int position) {

    if (position < 1 || position > getLength()) {
      System.out.println("Invalid position");
      return;
    }

    if (position == 1) {
      deleteAtFirst();
      return;
    }

    Node currentNode = head;

    int n = position - 1;
    for (int i = 1; i < n; i++) {
      currentNode = currentNode.next;
    }

    currentNode.next = currentNode.next.next;
  }

  void display() {
    Node currentNode = head;

    while (currentNode != null) {
      System.out.print(currentNode.data + " -> ");
      currentNode = currentNode.next;

    }
    System.out.print("null");
  }
}
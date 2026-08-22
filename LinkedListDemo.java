class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }

        System.out.println(node.data);
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }
    }

    public void replace(int index, int data) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        n.data = data;
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.next; // if index == zero to delete then the next number is marked as head.
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) { // loop runs untill the before index.
                n = n.next;
            }
            Node node = new Node();
            node = n.next;
            n.next = node.next;
            System.out.println("n1" + " " + node.data); // prints the deleted value.
            node = null; // assigns the object as null after deletion.
        }

    }
}

class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insert(67);
        list.insert(46);
        list.insert(55);
        list.insert(74);

        list.insertAtStart(55);

        list.insertAt(3, 22);
        list.replace(5, 75);

        list.show();

        list.delete(5);

    }
}

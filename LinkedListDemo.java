import java.util.LinkedList;

class LinkedListDemo{
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();

        list.add("is");
        list.add("a");
        list.addFirst("this");
        list.add("book");

        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.print("null");
        System.out.print(list.get(2));

    }
}

/*
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
*/




/*
// apna college linked list implementation

class LinkedListDemo{
    Node head;
    private int size;
    LinkedListDemo(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void printList(){
        if(head==null){
            System.out.print("list is null");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
    public void addFirst(String data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public void addLast(String data){
        Node node=new Node(data);
        if(head==null){
            head=node;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=node;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.print("list is empty");
            return ;
        }
        size--;
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.print("list is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public void delete(int index){
        if(index==0){
            head=head.next;
        }else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            size--;
            Node node=n.next;
            n.next=node.next;
            node=null;
        }
    }
    public void insertAt(int index, String data) {
        if (index == 0) {
            addFirst(data);
        } else {
            Node n = head;
            Node node = new Node(data);
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void replace(int index,String data){
        Node n=head;
        for(int i=0;i<index;i++){
            n=n.next;
        }
        n.data=data;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args){

        LinkedListDemo list=new LinkedListDemo();

        list.addFirst("List");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");

        list.printList();

        System.out.println();
        list.delete(2);
        list.printList();

        System.out.println();
        list.deleteLast();
        list.printList();

        System.out.println();
        // list.deleteFirst();
        list.printList();
        System.out.print(list.getSize());

        System.out.println();
        list.insertAt(2,"a");
        list.printList();

        System.out.println();
        list.replace(2,"aa");
        list.printList();

        
    }

}
*/
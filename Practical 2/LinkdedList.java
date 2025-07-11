class Node{
    int data;
    Node next;
    Node (){
        this.data = 0;
        this.next = null;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head = null;
    }
    void insert(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    void delete(int data){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Element not found");
        } else {
            current.next = current.next.next;
        }
    }
    boolean search(int data){
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    int size(){
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("By 22IT460");
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Linked List elements:");
        list.display();
        System.out.println("Size of the list: " + list.size());
        list.delete(20);
        System.out.println("Linked List after deletion:");
        list.display();
        System.out.println("Size of the list after deletion: " + list.size());
    }
}
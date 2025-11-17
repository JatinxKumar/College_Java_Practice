// Write a function to insert a new value at the beginning and end of a singly linked list.

public class linkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    linkedList() {
        head = null;
    }

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void traverse() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void deleteBeginning() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        head = head.next;
    }

    void deleteEnd() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.next == null) {
                temp.next = null;
                return;
            }
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.insertAtBeginning(5);
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        linkedList l2=new linkedList();
        // l1.traverse();
        // l2.traverse();

        l1.deleteBeginning();
        l1.traverse();
    }
}
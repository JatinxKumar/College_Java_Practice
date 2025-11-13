public class QueueLinkedList {
    private Node front;
    private Node rear;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public QueueLinkedList() {
        front = null;
        rear = null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int deQueue() {
        if (front == null) {
            System.out.println("Empty Queue");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        System.out.println("Queue contents:");
        queue.display();

        System.out.println("Dequeued: " + queue.deQueue());

        System.out.println("Queue after dequeue:");
        queue.display();
    }
}
public class QueueArray {
    int rear = 0;
    int front = 0;
    int size;
    int[] data;

    // Constructor to initialize queue with a given size
    public QueueArray(int size) {
        this.size = size;
        data = new int[size];
    }

    public void enQueue(int value) {
        if (rear == size) {
            System.out.println("Queue is Full");
        } else {
            data[rear++] = value;
        }
    }

    public int deQueue() {
        if (front >= rear) {
            System.out.println("Empty Queue");
            return -1;
        }
        return data[front++];
    }

    public void display() {
        if (front >= rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

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
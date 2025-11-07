public class Stack1{
    int top;
    int size;
    int[] arr;

    Stack1(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            int value = arr[top--];
            System.out.println("Popped: " + value);
            return value;
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.display();
        System.out.println("Top element after pop: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop(); // This will show underflow
    }
}
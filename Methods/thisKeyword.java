public class thisKeyword {
    int x;

    // Constructor with parameter
    public thisKeyword(int x) {
        this.x = x; // 'this' refers to the current object
    }

    // Method to display value of x
    public void display() {
        System.out.println("Value of x: " + this.x);
    }

    public static void main(String[] args) {
        thisKeyword obj = new thisKeyword(10);
        obj.display();
    }
}

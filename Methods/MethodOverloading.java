// Q-give code for a class with two overloaded display methods, one that takes an int and another that takes a String
class MethodOverloading {
    // Method to display an integer
    void display(int number) {
        System.out.println("Displaying integer: " + number);
    }

    // Overloaded method to display a string
    void display(String text) {
        System.out.println("Displaying string: " + text);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Calling the method with an integer argument
        obj.display(10); // Output: Displaying integer: 10

        // Calling the method with a string argument
        obj.display("Hello"); // Output: Displaying string: Hello
    }
}

class Test2 {
    String name;
    int age;

    void show(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    Test2() {
        System.out.println("Constructor called");
    }
}

public class Methods {
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));

        // Create an object of Test2 and use its methods
        Test2 obj = new Test2();
        obj.show("Alice", 25);
    }
}


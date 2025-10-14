// Q-write a class Circle with an instance variable radius and a method area() that returns the area. Create an call area() for two circles
public class Circle {
        int radius;

        void area(int radius){
            System.out.println("Area of circle is "+radius*radius*3.14);
        }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area(3);

        Circle c2 = new Circle();
        c2.area(6);
    }
}

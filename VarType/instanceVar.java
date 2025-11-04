class Car{
    String name;
    int year;

}
public class instanceVar {
    public static void main(String[] args) {
        Car c1=new Car();
        System.out.println("Before initializing: ");
        System.out.println(c1.name);
        System.out.println(c1.year);
        c1.name="Volvo";
        c1.year=1978;
        System.out.println("After initializing: ");
        System.out.println(c1.name);
        System.out.println(c1.year);
    }
}
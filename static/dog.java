public class Dog {
    String name;
    int age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;

    }
    public static void main(String[] args) {
        Dog d1=new Dog("Bruno",4);
        Dog d2=new Dog("Rocky",5);
        System.out.println("name:"+d1.name+"\nage:"+d1.age);
        System.out.println("name:"+d2.name+"\nage:"+d2.age);
    }
}

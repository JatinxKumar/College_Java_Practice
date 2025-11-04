public class staticVar {
    static int count = 0;
    staticVar() {
        count++;
        System.out.println("Object created. Count = " + count);
    }

    public static void main(String[] args) {
        staticVar s1 = new staticVar();
        staticVar s2 = new staticVar();
        staticVar s3 = new staticVar();
    }
}
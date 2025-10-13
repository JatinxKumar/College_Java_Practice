public class StatBook {
    static int totalBook;
    String title;
    void show(){
        totalBook++;
        System.out.println("title:"+title);
        System.out.println("totalBook:"+totalBook);
    }


}

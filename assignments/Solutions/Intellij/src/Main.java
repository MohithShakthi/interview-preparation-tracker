import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.offer("a");
        list.offer("b");
        list.offer("d");
        list.offer("e");

        list.add(2,"c");
        System.out.println(list);
        System.out.println(list.indexOf("c"));
        System.out.println(list.remove("b"));
        System.out.println(list);
    }
}
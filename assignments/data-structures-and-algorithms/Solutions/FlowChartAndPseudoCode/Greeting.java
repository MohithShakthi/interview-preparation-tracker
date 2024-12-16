package FlowChartAndPseudoCode;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name+" how are you");
        sc.close();
    }
}

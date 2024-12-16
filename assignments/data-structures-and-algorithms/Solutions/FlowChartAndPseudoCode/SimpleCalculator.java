package FlowChartAndPseudoCode;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        char operator = sc.next().charAt(0);
        if(operator == '+'){
            System.out.println(a+b);
        } else if (operator == '-') {
            System.out.println(a-b);
        } else if (operator=='*') {
            System.out.println(a*b);
        } else if (operator == '/') {
            System.out.println(a/b);
        }
        else {
            System.out.println("invalid operator");
        }
        sc.close();
    }
}

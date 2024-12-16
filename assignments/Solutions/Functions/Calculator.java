package Functions;

import java.util.Scanner;

public class Calculator {
    public static void calculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator Program: type");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("e for exit");
        while(true){
            System.out.println("enter your choise:");
            char c = sc.next().charAt(0);
            if(c == 'e') {
                sc.close();
                return;
            }
            System.out.println("enter first number:");
            int a = sc.nextInt();
            System.out.println("enter second number:");
            int b = sc.nextInt();
            System.out.print("result:");
            switch (c) {
                case '1':
                System.out.println(a+b);
                break;
                case '2':
                System.out.println(a-b);
                break;
                case '3':
                System.out.println(a*b);
                break;
                case '4':
                System.out.println(a/b);
                break;
                default:
                System.out.println("invalid choice");
                break;

            }
        }
    }
    public static void main(String[] args) {
        calculator();
    }
    
}

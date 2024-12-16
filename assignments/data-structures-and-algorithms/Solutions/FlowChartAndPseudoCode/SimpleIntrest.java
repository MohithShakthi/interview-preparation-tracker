package FlowChartAndPseudoCode;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter princilpe ammount:");
        int  p =sc.nextInt();
        System.out.println("Enter Time:");
        int n = sc.nextInt();
        System.out.println("Enter the intrest rate:");
        int r  = sc.nextInt();
        System.out.println("Simple intrest: "+(p*n*r)/100);
        sc.close();
    }
}

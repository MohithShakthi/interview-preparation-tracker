package FlowChartAndPseudoCode;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = 1;
        int prev = 0;
        int n = sc.nextInt();
        System.out.println("Finonacci series of "+n+" numbers:");
        if(n==1) System.out.println(current);
        else{
            System.out.println("1");
            for(int i=1; i<n; i++){
                int sum = current + prev;
                System.out.println(sum);
                prev = current;
                current = sum;
            }
        }
        sc.close();
    }
}

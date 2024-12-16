package Functions;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacciSeries(n);
        sc.close();
    }
    public static void fibonacciSeries(int n){
        int first = 0;
        int second = 1;
        for(int i=0;i<n;i++){
            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

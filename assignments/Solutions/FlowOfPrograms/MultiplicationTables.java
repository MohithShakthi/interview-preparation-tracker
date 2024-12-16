package FlowOfPrograms;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n+" time "+i+" = "+(n*i));
        }
        sc.close();
    }
}

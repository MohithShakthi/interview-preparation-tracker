package FlowOfPrograms;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int sum = 0;
        while (!num.equals("x")) {
            int n = Integer.valueOf(num);
            sum = sum + n;
            num = sc.next();
        }
        System.out.println(sum);
        sc.close();
    }
}

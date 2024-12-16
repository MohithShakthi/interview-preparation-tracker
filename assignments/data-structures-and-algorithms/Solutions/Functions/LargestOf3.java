package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(largest(a,b,c));
        sc.close();
    }
    public static int largest(int a, int b, int c){
        /*int[] arr = {a,b,c};
        Arrays.sort(arr);
        return arr[2];*/
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
}

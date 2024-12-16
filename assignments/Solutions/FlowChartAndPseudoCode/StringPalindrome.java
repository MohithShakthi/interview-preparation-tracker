package FlowChartAndPseudoCode;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        boolean flag = true;
        for(int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length-1-i]){
                flag = false;
                break;
            }
        } 
        if(flag) System.out.println("Palindrome");
        else System.out.println("not Palindrome");
        sc.close();
    }
}

package Functions;
import java.util.Scanner;
public class NumPalindrome {
    public static void main(String[] args) {
        checkPalindrome();
    }
    public static void checkPalindrome(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        while(temp>0){
            int rem = temp%10;
            temp = temp/10;
            rev = rev*10 + rem;
        }
        if(num == rev) System.out.println("Palindrome");
        else System.out.println("not Palindrome");
        sc.close();
    }
}

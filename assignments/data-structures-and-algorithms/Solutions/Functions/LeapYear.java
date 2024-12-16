package Functions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean flag = checkLeapYear(year);
        if(flag) System.out.println("Leap Year");
        else System.out.println("Not Leap Year");
        sc.close();
    }
    public static boolean checkLeapYear(int n){
        boolean flag;
        if(n%400 == 0) flag = true;
        else{
            if(n%4 == 0 && n%100 != 0) flag = true;
            else flag = false;
        }
        return flag;
    }
}

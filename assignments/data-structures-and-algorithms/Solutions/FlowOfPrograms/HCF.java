package FlowOfPrograms;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp1;
        int temp2;
        if(a>b){
            temp1 = a;
            temp2 = b;
        }else{
            temp1 = a;
            temp2 = b;
        }
        while(temp2 != 0){
            int rem  = temp1%temp2;
            temp1 = temp2;
            temp2 = rem;
        }
        int lcm = (a*b)/temp1;
        System.out.println("LCM of "+a+" and "+b+" is: "+lcm);
        System.out.println("HCF of "+a+" and "+b+" is: "+temp1);
        sc.close();

    }
}

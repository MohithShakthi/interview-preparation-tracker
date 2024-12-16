package Functions;
import java.util.Scanner;
public class GDC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        findGDC(a,b);
        sc.close();       
    }
    public static void findGDC(int a,int b){
        int temp1 = a;
        int temp2 = b;
        while(temp2>0){
            int store = temp1;
            temp1 = temp2;
            temp2 = store%temp2;
        }
        System.out.println("GDC of "+a+" and "+b+" is:"+temp1);
    }
}
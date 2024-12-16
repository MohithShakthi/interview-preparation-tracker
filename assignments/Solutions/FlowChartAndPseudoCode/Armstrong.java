package FlowChartAndPseudoCode;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double sum = 0;
        int digits = (int) Math.log10(num)+1;
        int temp = num;
        while(temp>0){
            double rem = temp%10;
            temp = temp/10;
            sum = sum + Math.pow(rem, digits);
        }
        if(num == sum) System.out.println("Armstrong Number");
        else System.out.println("Not Armstrong Number");
        sc.close();
    }
}

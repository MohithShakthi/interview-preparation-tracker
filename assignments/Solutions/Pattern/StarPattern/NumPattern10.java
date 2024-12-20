import java.util.Scanner;

public class NumPattern10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int s=1;s<n-i;s++) System.out.print(" ");
            int num =1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println("");
        }

        sc.close();
    }
}

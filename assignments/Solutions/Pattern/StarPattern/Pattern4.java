import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++) System.out.print("*");
            System.out.println("");
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++) System.out.print("*");
            System.out.println("");
        }
        sc.close();
    }   
}

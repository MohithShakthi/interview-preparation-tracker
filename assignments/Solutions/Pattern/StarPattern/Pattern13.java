import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<n;i++) System.out.print(" ");
        System.out.println("*");
        for(int i=1;i<n-1;i++){
            for(int k=i;k<n-1;k++) System.out.print(" ");
            System.out.print("*");
            for(int j=0;j<2*i-1;j++) System.out.print(" ");
            System.out.print("*");
            System.out.println("");
        }
        for(int i=0;i<2*n-1;i++) System.out.print("*");
        sc.close();
    }
}

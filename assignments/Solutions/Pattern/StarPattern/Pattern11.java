import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++) System.out.print(" ");
            for(int k=i;k<n;k++) System.out.print("* ");
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            for(int j=n-1-i;j>0;j--) System.out.print(" ");
            for(int k=0;k<=i;k++) System.out.print("* ");
            System.out.println("");
        }
        sc.close();
    }
}

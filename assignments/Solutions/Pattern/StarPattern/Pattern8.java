import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int k=0;k<i;k++) System.out.print(" ");
            for(int j=(n-1-i)*2+1;j>0;j--) System.out.print("*");
            System.out.println("");
        }
        sc.close();
    }
}

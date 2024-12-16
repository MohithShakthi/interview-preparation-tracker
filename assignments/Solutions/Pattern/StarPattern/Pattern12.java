import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int k=0;k<=i;k++) System.out.print("* ");
            System.out.println("");
        }
        for(int i=1;i<n;i++){
            for(int k=0;k<=i;k++) System.out.print(" ");
            for(int j=i;j<n;j++) System.out.print("* ");
            System.out.println("");
        }
        sc.close();
    }
}

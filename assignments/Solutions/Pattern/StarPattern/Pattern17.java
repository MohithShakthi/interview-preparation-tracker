public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<n;i++){
            for(int k=1;k<=i;k++) System.out.print("*");
            for(int j=0;j<(n-i)*2;j++) System.out.print(" ");
            for(int k=1;k<=i;k++) System.out.print("*");
            System.out.println("");
        }
        for(int i=0;i<2*n;i++) System.out.print("*");
        System.out.println();
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++) System.out.print("*");
            for(int k=0;k<2*i;k++) System.out.print(" ");
            for(int j=0;j<n-i;j++) System.out.print("*");
            System.out.println("");
        }
    }
}

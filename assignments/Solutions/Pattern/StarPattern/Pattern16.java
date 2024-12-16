public class Pattern16 {
    public static void main(String[] args) {
        int n =5;
        for(int i=0;i<2*n;i++) System.out.print("*");
        System.out.println("");
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++) System.out.print("*");
            for(int k=0;k<2*i;k++) System.out.print(" ");
            for(int j=i;j<n;j++) System.out.print("*");
            System.out.println("");
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++) System.out.print("*");
            for(int k=0;k<(n-i)*2;k++) System.out.print(" ");
            for(int j=0;j<i;j++) System.out.print("*");
            System.out.println("");
        }
        for(int i=0;i<2*n;i++) System.out.print("*");
    }
}

public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<2*n-1;i++) System.out.print("*");
        System.out.println("");
        for(int i=1;i<n-1;i++){
            for(int j=0;j<i;j++) System.out.print(" ");
            System.out.print("*");
            for(int k=0; k<=(n-2)*2 - 2*i;k++) System.out.print(" ");
            System.out.print("*");
            System.out.println("");
        }
        for(int i=1;i<n;i++) System.out.print(" ");
        System.out.print("*");
    }
}

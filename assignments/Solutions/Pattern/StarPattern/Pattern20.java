public class Pattern20 {
    public static void main(String[] args) {
        int n=5;
        System.out.print("*");
        for(int i=0;i<2*n-2;i++) System.out.print(" ");
        System.out.print("*");
        System.out.println("");
        for(int i=1;i<n;i++){
            System.out.print("*");
            for(int j=1;j<i;j++) System.out.print(" ");
            System.out.print("*");
            for(int j=0;j<(n-1)*2-i*2;j++) System.out.print(" ");
            System.out.print("*");
            for(int j=1;j<i;j++) System.out.print(" ");
            System.out.print("*");
            System.out.println("");
        }
        for(int i=1;i<n;i++){
            System.out.print("*");
            for(int j=1;j<n-i;j++) System.out.print(" ");
            System.out.print("*");
            for(int j=0;j<2*i-2;j++) System.out.print(" ");
            System.out.print("*");
            for(int j=1;j<n-i;j++) System.out.print(" ");
            System.out.print("*");
            System.out.println("");
        }
        System.out.print("*");
        for(int i=0;i<2*n-2;i++) System.out.print(" ");
        System.out.print("*");
    }
}

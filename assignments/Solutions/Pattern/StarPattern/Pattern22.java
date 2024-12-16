public class Pattern22 {
    public static void main(String[] args) {
        int n =3;
        for(int i=1;i<n;i++) System.out.print(" ");
        System.out.print("*");
        for(int i=0;i<n;i++) System.out.print(" ");
        System.out.println("*");
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-i;j++) System.out.print(" ");
            System.out.print("*");
            for(int k=0;k<2*i-1;k++) System.out.print(" ");
            System.out.print("*");
            for(int j=1;j<n-i;j++) System.out.print(" ");
            System.out.print("*");
            for(int k=0;k<2*i-1;k++) System.out.print(" ");
            System.out.println("*");
        }
        System.out.print("*");
        for(int i=0;i<n;i++) System.out.print(" ");
        System.out.print("*");
        for(int i=0;i<n;i++) System.out.print(" ");
        System.out.println("*");
    }
}

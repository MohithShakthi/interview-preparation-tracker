package assignments.Solutions.Pattern;

public class Square {
    public static void main(String[] args) {
        int num = 6;
        int pow = 5;
        System.out.println(square(num, pow));
    }
    public static int square(int n, int p){
        if(n == 0) return 0;
        if(p == 0) return 1;
        if(p == 1) return n;
        return n*square(n, p-1);
    }
}

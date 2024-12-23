package assignments.Solutions.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(57));
    }
    public static int mySqrt(int x) {
        long s  = 1;
        long e = x;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid*mid == x) return (int)mid;
            else if(mid*mid > x) e = mid-1;
            else s = mid+1;
        }
        return (int)e;
    }
}

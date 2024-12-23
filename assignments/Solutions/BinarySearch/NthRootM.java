package assignments.Solutions.BinarySearch;

public class NthRootM {
    public static void main(String[] args) {
        System.out.println(nthRoot(2, 9));
    }
    public static int nthRoot(int n, int m) {
        // code here
        int s = 1;
        int e = m;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(pow(mid,n) == m) return mid;
            else if(pow(mid,n) > m) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }
    public static int pow(int n, int p){
        if(n == 0) return 0;
        if(p == 0) return 1;
        if(p == 1) return n;
        return n*pow(n, p-1);
    }
}

package assignments.Solutions.BinarySearch;
// https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=k-th-element-of-two-sorted-array
public class KthElement2SortedArrays {
    public static void main(String[] args) {
        
    }
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n1 = a.length;
        int n2 = b.length;
        if(n1 > n2) return kthElement(b,a,k);
        
        int start = Math.max(0,k-n2);
        int end = Math.min(n1,k);
        while(start <= end){
            int mid1 = start+(end-start)/2;
            int mid2 = k-mid1;
            
            int l1 = (mid1 > 0) ? a[mid1-1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? b[mid2-1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? b[mid2] : Integer.MAX_VALUE;
            
            if(l1 <= r2 && l2 <= r1){
                return Math.max(l1,l2);
            }
            else if(l1 > r2) end = mid1-1;
            else start = mid1+1;
            
        }
        return 0;
    }
}

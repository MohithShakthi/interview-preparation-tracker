// https://leetcode.com/problems/median-of-two-sorted-arrays/
package assignments.Solutions.BinarySearch;

public class Median2SortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 ={2};
        //Output: 2.00000
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 > n2) return findMedianSortedArrays(nums2,nums1);

        int n = n1+n2;
        int left = ((n1+n2)%2 == 0) ? (n1+n2)/2 : (n1+n2+1)/2;
        int start = 0;
        int end = n1;
        while(start <= end){
            int mid1 = start+(end-start)/2;
            int mid2 = left - mid1;

            int l1 = (mid1 > 0) ? nums1[mid1-1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? nums2[mid2-1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? nums2[mid2] : Integer.MAX_VALUE;
            
            if(l1 <= r2 && l2 <= r1){
                if(n % 2 == 0){
                    return ((double)(Math.max(l1,l2)+Math.min(r1,r2)))/2;
                }else{
                    return Math.max(l1,l2);
                }
            }else{
                if(l1 > r2) end = mid1-1;
                else start = mid1+1;
            }

        }
        return 0;

    }
}

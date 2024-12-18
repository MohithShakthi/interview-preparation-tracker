package Searching;

public class Interpolation {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for(int i=0;i<arr.length;i++){
            arr[i] = i;
        }
        int key = -1;
        int index = interpolationSearch(arr, key);
        if(index == -1) System.out.println("key not found");
        else System.out.println("key "+key+" found at index:"+index);
    }
    static int interpolationSearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while(key >= arr[low] && key <= arr[high] && arr[low] <= arr[high]){
            int pos = low + ((high-low)*key-arr[low])/(arr[high] - arr[low]);
            if(arr[pos] == key) return pos;
            else if (key > arr[pos]) low = pos+1;
            else high = pos-1;
        }
        return  -1;
    }
}

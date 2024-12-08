import java.util.*;

public class pfs {
    public static void prefixSum(int arr[]){
        int n = arr.length;
        int[] pfs = new int[n];

        pfs[0] = arr[0];
        for(int i=1;i<n; i++){
            pfs[i] = pfs[i-1]+arr[i];
        }
        for(int i=0;i<pfs.length; i++){
            System.out.print(pfs[i]+ " ");
        }  
        System.out.println();
        max(pfs);
    }

    public static void max(int arr[]){
        int max =0;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum is : "+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        prefixSum(arr);
    }
}

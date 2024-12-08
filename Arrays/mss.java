import java.util.*;

public class mss {
    public static void maxss(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum =0;
                for(int k =i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    currSum += arr[k];
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
                
                System.out.println();
            }
            System.out.print("Current sum of this subarray is : "+currSum);
            System.out.println();
            System.out.println();
        }

        System.out.println("Maximum of the subarray is : "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        maxss(arr);
    }
}

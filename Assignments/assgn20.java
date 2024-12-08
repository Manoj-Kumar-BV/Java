import java.util.*;

public class assgn20 {
    public static boolean ContainDuplicates(int[] nums){
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                System.out.println("True"); //for confirming
                
                return true;
                
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {2,12,3,12,535,4656,5768,87,9898,809};
        ContainDuplicates(arr);
    }
}

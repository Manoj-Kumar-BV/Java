// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         if (nums.length == 1){
//             return nums[0];
//         }
//         for(int i=0;i<=nums.length-1; i++){
//             if(i==0){
//                 if(nums[i] != nums[i+1]){
//                     return nums[i];
//                 }
//             }
//             else if(i==nums.length-1){
//                 if(nums[i] != nums[i-1]){
//                     return nums[i];
//                 }
//             }
//             else{
//                 if(nums[i] != nums[i-1] && nums[i] != nums[i+1]){
//                     return nums[i];
//                 }
//             }
//         }
//         return -1;
//     }
// }
//This is Brute Force which gives O(N) TC


class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low =0, high = nums.length-1;

        while(low < high){
            int mid = (low + high)/2;

            boolean isEven = (mid%2==0);

            if((isEven && nums[mid] == nums[mid+1]) || (!isEven && nums[mid] == nums[mid-1])){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }
}

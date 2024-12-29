// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int si = -1, ei = -1;
//         for(int i=0; i<nums.length; i++){
//             if(nums[i] == target){
//                 si = i;
//                 break;
//             }
//         }
//         for(int j=nums.length-1; j>=0; j--){
//             if(nums[j] == target){
//                 ei = j;
//                 break;
//             }
//         }
//         return new int[] {si,ei};
//     }
// }
//This is O(N) Approach


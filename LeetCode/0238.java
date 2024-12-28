// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int ans[] = new int[nums.length];
//         for(int i=0; i<nums.length; i++){
//             ans[i] = 1;
//             for(int j=0; j<nums.length; j++){
//                 if(i!=j){
//                     ans[i] = ans[i]*1*nums[j];
//                 }
//             }
//         }
//         return ans;
//     }
// }
//This is the O(n^2) Code which is not recommended

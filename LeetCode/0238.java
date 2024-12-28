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

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int ans[] = new int[n];

        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1]*nums[i];
        }
        

        suffix[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1]*nums[i];
        }
        

        ans[0] = suffix[1];
        ans[n-1] = prefix[n-2];

        for(int i=1; i<n-1; i++){
            ans[i] = prefix[i-1] * suffix[i+1];
        }
        return ans;        
    }
}
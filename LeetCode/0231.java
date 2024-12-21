// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         for(int x = 0; x<100; x++){
//             if(Math.pow(2,x) == n){
//                 return true;
//             }
//         }
//         return false;
//     }
// }
//This is the Brute Force Approach that came to my mind


class Solution {
    public boolean isPowerOfTwo(int n) {
        // return (n > 0) && (n & (n-1)) == 0;
        if(n > 0){
            if ((n &(n-1)) == 0){
                return true;
            }
        }
        
        return false;
    }
}

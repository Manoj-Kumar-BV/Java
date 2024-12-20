class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length-1;
        k=k%nums.length;
        reverseArray(nums,0,n);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n);
    }
    private void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}

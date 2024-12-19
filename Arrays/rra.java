public class rra {
    public static int[] rightrotateanArray(int[] nums){
        int temp = nums[nums.length-1];
        int newarr[] = new int[nums.length];
        for(int i=nums.length-1; i>0; i--){
            newarr[i] = nums[i-1];
        }
        newarr[0] = temp;

        return newarr;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};

        int[] rotatedArray = rightrotateanArray(arr);
        for(int i=0; i<rotatedArray.length; i++){
            System.out.print(rotatedArray[i]+" ");
        }
    }
}

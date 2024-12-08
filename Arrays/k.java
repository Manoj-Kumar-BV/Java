public class k {
    public static void kadanes(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            cs += arr[i];

            ms = Math.max(ms,cs);

            if(cs < 0){
                cs = 0;
            }
        }
        System.out.println("Maximum of subarray is : "+ms);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        kadanes(arr);

        int arr1[] = {-1};
        kadanes(arr1);
    }
}

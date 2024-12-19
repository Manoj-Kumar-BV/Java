public class lra {
    public static int[] leftrotateanarray(int[] n){
        int temp = n[0];
        for(int i=1;i<n.length;i++){
            n[i-1] = n[i];
        }
        n[n.length-1] = temp;
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        leftrotateanarray(arr);
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}

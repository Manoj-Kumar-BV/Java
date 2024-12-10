public class bs {
    public static void bubblesort(int arr[]){
        int n = arr.length;
        boolean Swapped;
        for(int i=0; i<n-1; i++){
            Swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    Swapped = true;
                }
            }
            if(!Swapped){
                break;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,5,2,3,1,8,45,43,2};

        bubblesort(arr);
        printArray(arr);
    }
}

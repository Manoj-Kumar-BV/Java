import java.util.*;

public class lna {

    public static int largnumofarray(int arr[]){
        int large = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of elements in the array : ");
        int no = sc.nextInt();

        int arr[] = new int[no];

        for(int i =0; i<no; i++){
            System.out.println("Enter "+i+" element ");
            arr[i] = sc.nextInt();
        }

        int large = largnumofarray(arr);
        System.out.println("The largest number among the given array is : "+large);
    }
}

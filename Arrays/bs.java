import java.util.*;

public class bs {

    public static int binarysearch(int arr[], int key){
        int start = 0, end = arr.length-1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if (arr[mid] < key){
                start = mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements : ");
        int no = sc.nextInt();

        int arr[] = new int[no];

        for(int i =0; i<no; i++){
            System.out.println("Enter "+i+" element ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key value : ");
        int key = sc.nextInt();

        Arrays.sort(arr); //since binary search works on sorted list

        int result = binarysearch(arr, key);

        if(result == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Element found at "+result+" index");
        }

    }   
}

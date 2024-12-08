import java.util.*;

public class ls {

    public static int linearsearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array : ");
        int no = sc.nextInt();

        int arr[] = new int[100];

        for(int i = 0; i < no; i++){
            System.out.println("Enter the "+i+" element");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key value : ");
        int key = sc.nextInt();

        
        int result = linearsearch(arr, key);
        if(result == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Element found at index "+result);
        }
    }
}


import java.util.Scanner;

public class ra {

    public static void reversearray(int arr[]){
        int first = 0, last = arr.length-1;

        while(first < last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements : ");
        int no = sc.nextInt();

        int arr[] = new int[no];

        for(int i = 0; i < no; i++){
            System.out.println("Enter "+i+" element ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        reversearray(arr);
        System.out.println("Reveresed array elements are : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

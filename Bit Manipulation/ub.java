import java.util.Scanner;

public class ub {
    public static int clearithBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int setithBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int updateithBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearithBit(n, i);
        // }else{
        //     return setithBit(n, i);
        // }

        n = clearithBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Enter the i\'th poition to update : ");
        int i = sc.nextInt();

        System.out.println("Enter the newBit to be updated with : ");
        int nb = sc.nextInt();

        System.out.println("Before Updating the number is : "+n);
        System.out.println("After updating the number is : "+updateithBit(n, i, nb));
    }
}

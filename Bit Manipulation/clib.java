import java.util.Scanner;

public class clib {
    public static int clearlastithBit(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Enter the i positions : ");
        int i = sc.nextInt();

        System.out.println(clearlastithBit(n, i));
    }
}

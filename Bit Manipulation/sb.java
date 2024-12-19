import java.util.Scanner;

public class sb {
    public static int setithBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Enter the i position : ");
        int i = sc.nextInt();

        System.out.println("After setting i\'th bit the number "+n+" becomes "+setithBit(n, i));
    }
}

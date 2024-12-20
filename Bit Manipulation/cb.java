import java.util.Scanner;

public class cb {
    public static int clearithBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        System.out.println("Enter the i\'th place : ");
        int i =sc.nextInt();

        System.out.println("On clearing the i\'th bit the number "+n+" becomes "+clearithBit(n, i));
    }
}

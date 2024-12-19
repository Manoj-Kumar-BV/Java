import java.util.Scanner;

public class gb {
    public static int getithbit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Enter the i\'th Position : ");
        int i = sc.nextInt();

        System.out.println("The i\'th bit is : "+getithbit(n, i));
    }
}

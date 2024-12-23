import java.util.Scanner;

public class assgn30 {
    public static int add1(int n){
        return -~n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Addition of 1 to the number is : "+add1(n));
    }
}

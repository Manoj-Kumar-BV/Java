import java.util.*;
public class ptno {
    public static int productoftwonum(int num1, int num2){
        int result = num1*num2;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int prod = productoftwonum(a, b);
        System.out.println("The product of two numbers is : "+prod);
    }
}

import java.util.*;
public class prod_nums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Product of two numbers");

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        int prod = a*b;

        System.out.println("Product of two numbers is : "+a+" * "+b+" = "+prod);
    }
}

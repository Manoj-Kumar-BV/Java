import java.util.*;
public class two_nums {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Sum of two numbers using user input");

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Sum of "+a+" & "+b+" is = ");
        int c = a+b;
        System.out.println(c);
    }
}

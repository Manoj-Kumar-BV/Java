import java.util.Scanner;

public class assgn29 {
    public static void swap(int x, int y){
        x = x^y;
        y = x^y;
        x = x^y;

        System.out.println("After swapping: x = "+x+" y = "+y);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int x = sc.nextInt();

        System.out.println("Enter second number : ");
        int y = sc.nextInt();

        System.out.println("Before swapping: x = "+x+" y = "+y);
        swap(x, y);
    }
}

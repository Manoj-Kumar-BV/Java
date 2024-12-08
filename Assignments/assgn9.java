import java.util.*;
public class assgn9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        if (a<0){
            System.out.println("Enter number is negative");
        }
        else{
            System.out.println("Entered number is positive");
        }
    }
}

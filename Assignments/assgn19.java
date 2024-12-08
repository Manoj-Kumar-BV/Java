import java.util.*;

public class assgn19 {
    public static int sod(int n){
        int sum = 0;
        while(n>0){
            int ld = n %10;
            sum += ld;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int sumofdigits = sod(n);
        System.out.println("Sum of digits in the given integer "+n+" is = "+sumofdigits);
    }
}

import java.util.*;

public class assgn18 {
    
    public static boolean checkpalindrome(int n){
        int reverse = 0;
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = (reverse*10)+rem;
            temp /=10;            
        }
        if(n == reverse){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(checkpalindrome(n));
    }
}

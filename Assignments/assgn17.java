import java.util.Scanner;

public class assgn17 {
    
    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}

import java.util.Scanner;

public class ff {
    public static int factorial(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact = fact *i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int no = sc.nextInt();

        int fact = factorial(no);

        System.out.println("The factorial of the number "+no+" is : "+no+"! == "+fact);
        
    }
}

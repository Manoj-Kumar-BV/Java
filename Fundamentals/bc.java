import java.util.*;

public class bc {
    public static int factorial(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
            fact = fact *i;
        }
        return fact;
    }

    public static int binomialcoefficient(int n, int r){
        int n_fact = factorial(n);

        int r_fact = factorial(r);

        int nr_fact = factorial(n-r);

        int bc = n_fact/(r_fact*(nr_fact));

        return bc;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 'n' number : ");

        int n = sc.nextInt();

        System.out.print("Enter the 'r' number : ");
        int r = sc.nextInt();

        int binco = binomialcoefficient(n,r);

        System.out.println("Binomial Coefficient of given numbers n="+n+" & r="+r+" is : "+binco);
    }
}

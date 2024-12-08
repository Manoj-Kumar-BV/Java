import java.util.*;

public class assgn16 {
    
    public static void avg(int a, int b, int c){
        System.out.println("Average of three numbers is : "+((a+b+c)/3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int no1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int no2 = sc.nextInt();
        System.out.println("Enter the third number : ");
        int no3 = sc.nextInt();

        avg(no1, no2, no3);
    }
}

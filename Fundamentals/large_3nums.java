import java.util.*;
public class large_3nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        if( a >= b && a >= c ){
            System.out.println(a+" is greater");
        }
        else if(b >= c){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println(c+" is greater");
        }
    }
}

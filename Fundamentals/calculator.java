import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("Enter operation : ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+' : System.out.println("Addition of two numbers is : "+(a+b));   break;
            case '-' : System.out.println("Subtraction of two numbers is : "+(a-b));    break;
            case '*' : System.out.println("Multiplication of two numbers is : "+(a*b)); break;
            case '/' : if(b==0){
                System.out.println("Dividing by zero");
            }else{
                System.out.println("Division of two numbers is : "+(a/b));
            } break;
            case '%' : System.out.println("Modulo of two numbers is : "+(a%b)); break;
            default: System.out.println("Enter valid operation ");
        }
    }
}

import java.util.Scanner;

public class breakeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            if(n%10 == 0){
                System.out.println("Multiple of 10 entered");
                break;
            }
            System.out.println(n);
            
        }
    }
}

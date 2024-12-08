import java.util.Scanner;

public class conteg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            if(n%10 == 0){
                System.out.println("Sorry");
                continue;
            }
            System.out.println(n);
            
        }
    }
}

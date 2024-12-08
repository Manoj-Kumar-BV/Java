import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n==2){
            System.out.println("Prime");
        }
        else{
            boolean isprime = true;

            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0){
                    isprime = false;
                }
            }

            if(isprime == true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
            
        }
    }
}

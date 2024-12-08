import java.util.*;
public class assgn13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, evensum=0, oddsum=0, option;

        do{
            System.out.println("Enter the number : ");
            n = sc.nextInt();

            if(n%2==0){
                evensum += n;
            }
            else{
                oddsum += n;
            }

            System.out.println("Continue : 1 for yes, 0(or other) for No");
            option = sc.nextInt();
        }while(option == 1);

        System.out.println("Even Sum = "+evensum);

        System.out.println("Odd Sum = "+oddsum);
    }
}

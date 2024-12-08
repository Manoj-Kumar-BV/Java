import java.util.*;
public class sfnno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N number : ");
        int n = sc.nextInt();

        int sum = 0;
        int value = 1; //since natural number starts from 1
        while(value <= n){
            sum = sum+value;
            value++;
        }
        System.out.println(sum);

    }
}

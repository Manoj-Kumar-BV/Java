import java.util.Scanner;

public class ceo{
    // public static int DectoBinary(int n){
    //     int pow = 0;
    //     int binNum = 0;

    //     while(n>0){
    //         int rem = n%2;
    //         binNum += rem * Math.pow(10,pow);

    //         pow++;
    //         n /= 2;
    //     }
        
    //     return binNum;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        // n = DectoBinary(n);
        // if(n%2 == 0){
        //     System.out.println("Even");
        // }
        // else{
        //     System.out.println("Odd");
        // }

        int lsb = n & 1;
        if(lsb == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
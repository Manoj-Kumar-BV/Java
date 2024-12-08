import java.util.*;

public class dtb {
    
    public static void dectoBin(int n){

        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("Binary number is : "+binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the decimal number : ");
        int n = sc.nextInt();

        dectoBin(n);
        
    }
}

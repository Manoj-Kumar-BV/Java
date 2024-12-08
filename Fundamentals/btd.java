import java.util.*;

public class btd {
    public static void bintodec(int binNum){
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binNum /= 10;
        }
        System.out.println("Decimal of binary number = "+decNum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number : ");
        int binarynumber = sc.nextInt();
        bintodec(binarynumber);
    }
    
}

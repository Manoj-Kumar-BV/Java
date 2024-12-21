import java.util.Scanner;

public class po2 {
    public static boolean ispowerof2(int n){
        if(n>0){
            if((n &(n-1))==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it's a number of 2 or not : ");
        int n = sc.nextInt();
        System.out.println(ispowerof2(n));
    }
}

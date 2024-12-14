import java.util.Scanner;

public class cp {
    public static boolean checkPalindrom(String str){
        int n = str.length();
        for(int i=0; i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("Not Palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.next();

        checkPalindrom(str);
    }
}

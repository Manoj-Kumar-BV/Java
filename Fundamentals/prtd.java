import java.util.*;
public class prtd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number that u want to get reverse of it : ");
        int n = sc.nextInt();

        while(n > 0){
            int lastdigit = n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
        // for (;n>0;n/=10){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit);
        // }
    }
}

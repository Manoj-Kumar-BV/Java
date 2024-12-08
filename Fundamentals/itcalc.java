import java.util.*;
public class itcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in lakhs");

        int a = sc.nextInt();
        int tax;

        if(a<500000){
            tax = 0;
            System.out.println("You don't want to pay any tax");
        }
        else if (a >= 500000 && a < 1000000){
            tax = (int)(a*0.2);
            System.out.println(("You should pay the tax of rupees "+tax));
        }
        else {
            tax = (int)(a*0.3);
            System.out.println("You should pay the tax of rupees "+tax);
        }
    }
}

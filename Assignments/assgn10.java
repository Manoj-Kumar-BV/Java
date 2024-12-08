import java.util.*;
public class assgn10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the temperature : ");
        float temp = sc.nextFloat();

        if(temp > 100){
            System.out.println("You have fever");
        }
        else{
            System.out.println("You don't have fever");
        }
    }
}

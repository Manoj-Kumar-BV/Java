import java.util.*;
public class assgn3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of the pencil : ");
        float a = sc.nextFloat();

        System.out.println("Enter the price of the pen : ");
        float b = sc.nextFloat();

        System.out.println("Enter the price of the eraser : ");
        float c = sc.nextFloat();

        float tp = a+b+c;

        System.out.println("The total price of the items is : "+tp);

        float SGST = tp+(tp*18/100);
        float CGST = tp+(tp*18/100);

        float tp2 = tp+SGST+CGST;

        System.out.println("The total price including GST is : "+tp2);

    }
}

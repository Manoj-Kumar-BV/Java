import java.util.*;
public class aoc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("The area of circle formula is pi*r*r(where pi = 3.14, and r = radius)");
        System.out.println("Enter the Radius");
        float rad = sc.nextFloat();

        System.out.println("The area of circle for the entered radius "+rad+" is "+3.14*rad*rad);
    }
}

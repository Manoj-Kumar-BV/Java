import java.util.*;

public class rmb {
    public static void main(String[] args) {
        System.out.println(getrightmostbit(2));
    }

    private static int getrightmostbit(int n){
        int position = 0;
        while ((n&1) == 0){
            n = n>>1;
            position++;
        }
        return position;
    }
}

public class kth {
    public static boolean checkkthBit(int n, int k){
        n = n>>k;
        if((n & 1)== 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkkthBit(4, 02));
    }
}

public class csbn {
    public static int countsetbits(int n){
        int count = 0;
        while(n > 0){
            int lsb = n & 1;
            if(lsb == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countsetbits(10));
    }
}

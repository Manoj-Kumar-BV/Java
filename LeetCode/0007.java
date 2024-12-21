class Solution {
    public int reverse(int x) {
        int reverse = 0;
        while(x != 0){
            int ld = x % 10;

            if((reverse > (Integer.MAX_VALUE)/10 || reverse < (Integer.MIN_VALUE)/10)){
                return 0;
            }
            reverse = ld +(reverse*10);
            x /= 10;
        }
        return reverse;
    }
}
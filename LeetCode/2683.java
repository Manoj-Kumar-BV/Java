class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        return (checkValid(derived,0) || checkValid(derived,1));
    }
    private boolean checkValid(int[] derived, int fv){
        int n = derived.length;
        int original[] = new int[n];
        original[0] = fv;

        for(int i=0; i<n-1; i++){
            original[i+1] = derived[i] ^ original[i];
        }

        return derived[n-1] == (original[n-1] ^ original[0]);
    }
}

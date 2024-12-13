public class assgn25 {
    public static void main(String[] args) {
        int mat[][] = {{1,4,9},{11,4,3},{2,2,3}};

        int sum = 0;
        for(int j=0; j<mat[0].length; j++){
            sum += mat[1][j];
        }
        System.out.println(sum);
    }
}

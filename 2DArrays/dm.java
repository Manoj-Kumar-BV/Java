public class dm {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            sum+= matrix[i][i];

            if (i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
}
import java.util.Scanner;

public class ls {
    
    public static void searchlsv(int matrix[][]){
        int lrvalue = Integer.MIN_VALUE, svalue = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length ;i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] < svalue){
                    svalue = matrix[i][j];
                }
                if (matrix[i][j] > lrvalue) {
                    lrvalue = matrix[i][j];
                }

            }
        } 
        System.out.println("Largest element is : "+lrvalue);
        System.out.println("Smallest element is : "+svalue);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        searchlsv(matrix);
    }
}

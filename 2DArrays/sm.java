import java.util.Scanner;

public class sm {
    public static void spiralmatrix(int matrix[][]){
        int startRow = 0, endRow = matrix.length-1;

        int startCol = 0, endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        int n=matrix.length, m=matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        spiralmatrix(matrix);
    }
}

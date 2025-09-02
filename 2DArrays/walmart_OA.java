import java.util.Scanner;

public class walmart_OA {
    static int[][] OA(int N){
        int[][] result = new int[N][N];

        int num = N * N;
        int sr = 0;
        int er = N-1;
        int sc = 0;
        int ec = N-1;
        while(sr <= er && sc <=ec){
            for(int j=ec; j>=sc; j--){
                result[sr][j] = num;
                num--;
            }
            for(int i =sr+1; i<=er; i++){
                result[i][sc] = num;
                num--;
            }
            for(int j=sc+1; j<=ec; j++){
                result[er][j] = num;
                num--;
            }
            for(int i=er-1; i>=sr+1; i--){
                result[i][ec] = num;
                num--;
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        return result;
    }

    static int diagonalsum(int[][] matrix){
        int sum = 0;
        int n = matrix.length;
        for(int i=0; i<n; i++){
            sum += matrix[i][i];
            if(i != n-1-i){
                sum += matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mat = OA(N);


        for(int i=0;i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(diagonalsum(mat));
    }
}

import java.util.Scanner;

public class hp {
    public static void hollowpatterns(int totRows, int totCols){
        for(int i = 1; i <= totRows; i++){
            for(int j = 1; j <= totCols; j++){
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of rows : ");
        int rows = sc.nextInt();

        System.out.println("Enter total number of columns : ");
        int cols = sc.nextInt();

        hollowpatterns(rows, cols);
    }
}

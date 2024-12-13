public class ss {
    public static boolean staircaseSearching(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key Found at cell ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Not found!");
        return false;
    }

    public static void main(String[] args) {
        int mat[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        staircaseSearching(mat, 100);
    }
}

import java.util.Scanner;

public class sp {

    public static float getShoortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length();i++){
            int dir = path.charAt(i);

            if(dir == 'N' || dir == 'n'){
                y++;
            }else if(dir == 'S' || dir == 's'){
                y--;
            }else if(dir == 'W' || dir == 'w'){
                x--;
            }else if(dir == 'E' || dir == 'e'){
                x++;
            }else{
                return -1;
            }
        }
        int a = x*x;
        int b = y*y;

        return (float)Math.sqrt(a+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Path : ");
        String str = sc.next();

        System.out.println("The shortest path to reach the destination is : "+(getShoortestPath(str)));
    }
}

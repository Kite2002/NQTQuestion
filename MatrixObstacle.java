import java.util.*;
public class MatrixObstacle {
    public static int printWays(int i,int j,int[][] arr ,int m ,int n){
        if(m == i || n == j ){
            return 0;
        }
        if(arr[i][j] == 1){
            return 0;
        }
        if(i == m-1 && j == n-1){
            return 1;
        }
        return printWays(i+1 , j , arr , m , n) + printWays(i , j+1 , arr ,m , n);
    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int obstacleCount = sc.nextInt();
        for(int i = 0 ; i < obstacleCount ; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            arr[first-1][second-1] = 1;
        }
        System.out.println("The total number of ways = "+printWays(0 , 0 ,arr , m , n));
        sc.close();
    }
}
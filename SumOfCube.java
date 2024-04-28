import java.util.*;

public class SumOfCube{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long  sum = 0;
        for(int i = a ; i <= b ; i++){
            sum = sum + (long)Math.pow(i , 3);
        }
        System.out.println("Sum :"+sum);
        sc.close();
    }
}
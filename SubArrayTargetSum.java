// subarray with target sum 
import java.util.*;

class SubArrayTargetSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer , Integer> map = new HashMap<>();
        int currentSum  =0 ;
        for(int i = 0 ;i < size ; i++){
            currentSum+=arr[i];
            if(currentSum == target){
                System.out.println("indexes :"+(0)+" "+i);
                break;
            }
            if(map.containsKey(currentSum - target)){
                System.out.println("indexes :"+(map.get(currentSum-target) + 1)+" "+i);
                break;
            }
            map.put(currentSum , i);
        }
        sc.close();
    }
}
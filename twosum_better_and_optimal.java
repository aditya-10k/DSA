import java.util.HashMap;
import java.util.Map;

public class twosum_better_and_optimal {
    
    public static void main(String[] args) {
        
        int arr[] = {1,3,3,8,10};
        int target = 14;

        System.out.println(twosumopti(arr , target));
    }

    static String twosumopti(int arr[] , int target ){

        int left = 0 ; int right =arr.length-1 ; int sum = 0 ;
        
        while (left<=right) {
            sum = arr[left]+arr[right];
            if(sum> target){
                right-- ; 
            }
            else if(sum<target){
                left++;
            }

            if(sum == target){
                return "success";
            }
            
        }
        return "false";
    }

    static String twosums(int arr[] , int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
             map.put(i, arr[i] );
        }

        for(int i = 0 ; i < arr.length ; i++){
            int rem = target - arr[i] ;
            if(map.containsValue(rem)){
                return "success";
            } 
        }
        return "fail";
    }
}

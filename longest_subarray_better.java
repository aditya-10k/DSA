import java.util.HashMap;
import java.util.Map;

public class longest_subarray_better {
    public static void main(String[] args) {
        
        int maxlength = 0 ; 
        long sum = 0 ; 
        int k = 10 ;
        int arr[] = {2,3,5,1,9};
        Map<Long , Integer> map = new HashMap<>();

        for(int i = 0 ; i <arr.length ; i++){

            sum+=arr[i];

            if(sum == k){
                maxlength = Math.max(maxlength, i+1);
            }

            long rem = sum - k ;

            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxlength = Math.max(maxlength, len);
            }

            if(!map.containsKey(rem)){
                map.put(sum, i);
            }
        }

        System.out.println(maxlength);
    }
}

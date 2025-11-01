public class longest_subarray_optimal {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,1,1,1,1,3,3};
        long k = 6;
        long sum = arr[0] ; 
        int left = 0 ; int right = 0 ; 
        int longest=0;

        while (right<arr.length) {
            while (left<= right && sum > k) {
                sum-= arr[left];
                left++;
            }

            if(sum == k){
                longest = Math.max(longest, right - left +1 );
            }

            right++ ; 
            if (right<arr.length) {
                 sum += arr[right];
            }
            
        }
        System.out.println(longest);
    }
}

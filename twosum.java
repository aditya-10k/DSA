class twosum {
    public static int[] twoSums(int[] nums, int target) {

        int out[] = new int [2] ;
        
                        System.out.println("value of length is"+ nums.length);

            int ctr = 0 ;
            for( ctr = 0 ; ctr < nums.length ; ctr ++)
            {
            for (int j = 1 ; j < nums.length ; j ++)
            {
                System.out.println("value of ctr is"+ ctr);
                System.out.println("value of j is"+ j);
            if(nums[j] + nums[ctr] == target)
            {
                out[1] = j ; 
                out[0] = ctr;
                break;
            }

            }
        }
            
        
        return out ;
    }

    public static void main(String[] args) {
        
        int input[]= {3,2,3} ;
        int out[] = twoSums(input, 6);
        System.out.println(out[0]+","+ out[1]);
    }
}
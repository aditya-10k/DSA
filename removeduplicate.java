public class removeduplicate {
    public static void main(String[] args) {
        
        int arr [] = {1,1,2,3,6,7,69,69,89};

        int ctr = 1 ;
        int ptr = 0 ; 

        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[ptr] != arr[i] ){
                arr[ctr] = arr[i];
                ctr++ ; 
                ptr = i ;
            }
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
        System.out.println(arr[i]);
        }
    }
}

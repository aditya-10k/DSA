public class bubble_insertion {
    
    public static void main(String[] args) {
        
        int [] arr = {23, 67,1 ,69 , 3};

        bubble(arr , arr.length-1);

        for(int i = 0 ; i< arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }

    static void bubble(int arr [] , int n ){

        if (n == 1) return ;

        boolean didSwap = false;

        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i]> arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1] ; 
                arr[i+1] = temp ;
                didSwap = true ; 
                System.out.println("swapped");
            }
        }
        if(!didSwap)
             return ; 
        bubble(arr, n-1);
    }
}

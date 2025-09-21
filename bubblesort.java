public class bubblesort {
    
    public static void main(String[] args) {
        
        int arr[] = {23, 4, 56,7 ,69};
        //int arr[] = {1,2,3,4,5,6};
        int n = 5 ;
        boolean didSwap = false;

        for(int i = n-1 ; i >= 0 ; i --)
        {
            for(int j = 0  ; j < i-1 ; j++)
            {
                if(arr[j]> arr[j+1])
                {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp ;
                didSwap = true ;
                }
            }
            if(!didSwap){break;}
        }
        for(int i = 0 ; i <n ; i++)
        {
        System.out.println(arr[i]);
        }
    }
}

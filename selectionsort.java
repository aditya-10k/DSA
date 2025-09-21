public class selectionsort {
    public static void main(String[] args) {
        int n = 5;
        int arr[]  = {2 , 1, 56,3 , 69};
        int min ;

        for(int i = 0 ; i < n-2 ; i ++)
        {
            min = i ;

            for(int j = i ; j < n-1 ; j++)
            {
                if(arr[j]< arr[min]){
                  min = j ;
                }
            }
            int temp = arr[i] ;
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i = 0 ; i < n ; i ++)
        {
        System.out.println(arr[i]);
        }
    }
}

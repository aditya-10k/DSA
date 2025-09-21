public class insertionsort {
    public static void main(String[] args) {
        
        int arr[] = {2 , 69, 56 , 1 , 9};
        int n = 5 ; 

        for(int i = 1 ; i< n ; i ++)
        {
            int j = i ;
            while (j>0) {
                if( arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp ;
                }
                j-- ; 
            } 
        }
        for(int i = 0 ; i <n ; i++)
        {
        System.out.println(arr[i]);
        }
    }
}

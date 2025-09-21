public class mergesort {
    public static void main(String[] args) {
    
    int arr[] = {12,1,34,5,78,69};

    merge(arr , 0 , arr.length-1 );

    for(int i = 0 ; i < arr.length ; i++ ){
        System.out.println(arr[i]);
    }
    }

    static void merge(int arr[] , int low , int high)
    {
        if(low == high) return ; 
        int mid = (low) + (high-low)/2 ; 
        merge(arr , low , mid);
        merge(arr, mid+1, high);
        merge_sort(arr , low , mid , high);
    }

    static void merge_sort(int arr[] , int low , int mid , int high)
    {
        int [] temp = new int[high-low+1];
        int left = low ; int right = mid +1 ; 

        int ctr = 0 ; 

        while(left <= mid && right <= high )
        {
            if(arr[left] < arr[right])
            {
                temp[ctr] = arr[left];
                left ++ ; ctr ++ ;
            }
            else{
                temp[ctr] = arr[right];
                right ++ ; ctr ++ ;
            }
        }

        while(left <= mid){
            temp[ctr] = arr[left];
            ctr ++ ; left ++ ;
        }

        while (right<=high) {
            temp[ctr] = arr[right];
            ctr ++ ; right ++ ; 
        }

        for(int i = 0 ; i < temp.length ; i++)
        {
            arr[low + i] = temp[i]; 
        }

    }

}

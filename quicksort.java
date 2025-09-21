public class quicksort {
    
    public static void main(String[] args) {
        
        int arr[] = {12, 5 , 79 , 4 , 69 , 1};

        quick(arr , 0 , arr.length-1);

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }

    static void quick(int [] arr , int low , int high)
    {
        if(low<high)
        {
        int pivot = partition(arr , low , high);
        quick(arr, low, pivot-1);
        quick(arr, pivot+1, high);
        }
    }

    static int partition(int [] arr , int low , int high){

        int pivot = arr[low] ;
        int i = low;
        int j = high; 
        while(i < j)
        {
            while(arr[i]<=pivot && i<high){ i++;}
            while(arr[j]>pivot && j>low){j--;}

            if(i< j){ swap(arr ,i, j);}
        }
        swap(arr ,low, j);
        return j;
    }

    static void swap(int [] arr , int a , int b){
        int temp = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = temp ;
    }
}

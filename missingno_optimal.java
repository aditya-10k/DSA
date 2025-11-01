public class missingno_optimal {

    public static void main(String[] args) {
        int arr[] = {1,3,4,5};

        int end = arr[arr.length-1];

        int a = 0 ; int b = 0 ;


        for(int i= 0 ; i<end-1 ; i++)
        {
          a = a ^ arr[i];
          b = b ^ i+1 ;
        }
        b = b ^ end ;
        System.out.println(a^b);
        
    }
    
}

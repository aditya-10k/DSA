public class slargest {
    
    public static void main(String[] args) {
        
        int arr [ ] = {103 , 5 ,1 ,45 ,67 ,69};
        int slargest = -1;
        int largest = arr[0];

        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i]> largest){
                slargest = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]> slargest){
                slargest = arr[i];
            }
        }
        System.out.println(slargest);
    }
}

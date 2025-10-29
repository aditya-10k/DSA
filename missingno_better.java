import java.util.ArrayList;

public class missingno_better {
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,5};
        ArrayList<Integer> missing = new ArrayList<>();
        int start = arr[0];
        int end = arr[arr.length-1] ;
        int j = 0 ;

        for (int i = start ; i< end; i ++){
            if(i  != arr[j]){
                missing.add(i);
                break;
            }
            j++;
        }

        for(int x : missing){
            System.out.println(x);
        }
    }
}

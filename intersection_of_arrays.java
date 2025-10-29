import java.util.*;

public class intersection_of_arrays {

    public static void main(String[] args) {
    
    int arr1[] = {1,1,2,4,5,6};
    int arr2[] = {1,1,3,3,5,8,9};

    ArrayList<Integer> intersection = new ArrayList<>();
    
    int i = 0 ; 
    int j = 0 ;

    while(i< arr1.length && j < arr2.length ){
        if (arr1[i] == arr2[j]) {
            if (intersection.size()==0||intersection.get(intersection.size()-1) != arr1[i]) {
             intersection.add(arr1[i]);
            }
            i++ ; j++ ; 
        }else{
            if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
    }

    for(int x: intersection){
        System.out.print(x + "\t");
    }
}
}

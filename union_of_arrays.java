import java.util.ArrayList;

public class union_of_arrays {

    public static void main(String[] args) {

        int arr1[] = { 1, 1, 3, 4, 5, 6 };
        int arr2[] = { 1, 2, 2, 3, 6, 7 };

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr1.length) {
            if (arr1[i] <= arr2[j]) {
                if (union.size()== 0 ||union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size()== 0 ||union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < arr1.length) {
            if (union.size()== 0 ||union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (union.size()== 0 ||union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        for(int x :union){
            System.out.print(x + "\t");
        }
    }
}

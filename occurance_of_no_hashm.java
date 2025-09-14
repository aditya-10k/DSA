import java.util.*;

public class occurance_of_no_hashm {

    public static void main(String[] args) {

        int arr[] = { 1, 3, 45, 7, 1, 2, 3, 4, 1 };

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;
        int keyy = 0;

        for (int key : hash.keySet()) {

            if (count < hash.get(key)) {
                count = hash.get(key);
                keyy = key;
            }
        }
        System.out.println(keyy + "->" + count);

    }
}

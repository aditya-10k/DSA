public class krotation {

    public static int[] reverse(int[] temp , int start , int end){
        while (end > start) {
            int t = temp[start];
            temp[start] = temp[end];
            temp[end] = t;
            start++;
            end--;
        }
        return temp;
    }

    public static void leftshift(int k , int[] arr){
        k = k % arr.length; 
        int copy[] = arr.clone();
        copy = reverse(copy, 0, k-1);
        copy = reverse(copy, k, arr.length-1);
        copy = reverse(copy, 0, arr.length-1);

        System.out.println("The left shift array is");
        for(int i = 0; i < arr.length; i++){
            System.out.print(copy[i] + "\t");
        }
        System.out.println();
    }

    public static void rightshift(int k , int[] arr){
        k = k % arr.length; 
        int copy[] = arr.clone();
        copy = reverse(copy, 0, arr.length-1);
        copy = reverse(copy, 0, k-1);
        copy = reverse(copy, k, arr.length-1);

        System.out.println("The right shift array is");
        for(int i = 0; i < arr.length; i++){
            System.out.print(copy[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 2;

        leftshift(k, arr);
        System.out.println("---------");
        rightshift(k, arr);
    }
}

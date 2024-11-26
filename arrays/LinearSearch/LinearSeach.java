package arrays.LinearSearch;

public class LinearSeach {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 10};
        System.out.println(linearSearch(arr, 23));
    }
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Element not found
    }
}

import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++) {
                arr2[j] = arr[i];
            }
        }

        return arr2;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            for(int j = -1; j < arr.length - 1; j++) {
                arr2[j] = arr[i];
            }
        }
        return arr2;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    arr[j] = -1;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] z = rotateLeft(new int[] {1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(z));
        int[] x = duplicateReplacer(new int[] {1, 2, 1, 1, 2});
        System.out.println(Arrays.toString(x));
    }
}

package Practice_For_Interview;

import java.util.Arrays;

public class Array_Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] Merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1,0, Merged,0, arr1.length);
        System.arraycopy(arr2,0, Merged, arr1.length, arr2.length);
        System.out.println(Arrays.toString(Merged));
    }
}
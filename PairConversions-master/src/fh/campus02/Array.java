package fh.campus02;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 12;
        array[1] = 56;
        array[2] = 77;

        System.out.println(Arrays.toString(array));

        int[] array2 = new int[] {12, 15, 7065};
        System.out.println(Arrays.toString(array2));

        // 1. Array an 2. Stelle --> dort steht nun 14
        array[2] = 14;
        System.out.println(Arrays.toString(array));

    }
}

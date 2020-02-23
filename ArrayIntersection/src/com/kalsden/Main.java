package com.kalsden;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Given three sorted arrays (with duplicates), output
        // an array with all the common elements
	    // int[] arr1 = {1, 8, 8, 8, 18, 19, 23, 56};
	    // int[] arr2 = {1, 8, 21, 56, 62, 82, 99};
	    // int[] arr3 = {2, 8, 23, 56, 56, 76, 85};

        int[] arr1 = {3, 6, 7, 8, 23};
        int[] arr2 = {2, 3, 6, 9, 23};
        int[] arr3 = {1, 3, 6, 15, 23};

	    ArrayList<Integer> intersection = findIntersection(arr1, arr2, arr3);
        System.out.println(Arrays.toString(intersection.toArray()));

    }

    public static ArrayList<Integer> findIntersection(int[] a1, int[] a2, int[] a3) {
        ArrayList<Integer> output = new ArrayList<>();
        int x = 0;
        int y = 0;
        int z = 0;

        while (x < a1.length || y < a2.length || z < a3.length) {
            if (a1[x] == a2[y] && a2[y] == a3[z]) {
                output.add(a1[x]);
                x = x + 1;
                y = y + 1;
                z = z + 1;
            }
            else if (a1[x] < a2[y]) {
                x = x + 1;
            }
            else if (a2[y] < a3[z]) {
                y = y + 1;
            }
            else {
                z = z + 1;
            }
        }

        return output;
    }
}

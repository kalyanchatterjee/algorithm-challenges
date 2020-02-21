package com.kalsden;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Given three sorted arrays (with duplicates), output
        // an array with all the common elements
	    int[] arr1 = {1, 8, 8, 8, 18, 19, 23, 56};
	    int[] arr2 = {1, 8, 21, 56, 62, 82, 99};
	    int[] arr3 = {2, 8, 23, 56, 56, 76, 85};

        // int[] arr1 = {3, 6, 7, 8};
        // int[] arr2 = {2, 3, 6, 9};
        // int[] arr3 = {1, 3, 6, 15};

	    ArrayList<Integer> intersection = findIntersection(arr1, arr2, arr3);
        System.out.println(Arrays.toString(intersection.toArray()));

    }

    public static ArrayList<Integer> findIntersection(int[] a1, int[] a2, int[] a3) {
        ArrayList<Integer> output = new ArrayList<>();
        int x = 0;
        int y = 0;
        int z = 0;

        while (x < a1.length - 1 || y < a2.length - 1 || z < a3.length - 1) {
            if (a1[x] == a2[y] && a2[y] == a3[z]) {
                output.add(a1[x]);
            }
            else if (a1[x] < a2[y]) {
                if (x < a1.length - 1) {
                    x++;
                }
            }
            else if (a2[y] < a3[z]) {
                if (y < a2.length - 1) {
                    y++;
                }
            }
            else {
                if (z < a3.length - 1) {
                    z++;
                }
            }
        }

        return output;
    }
}

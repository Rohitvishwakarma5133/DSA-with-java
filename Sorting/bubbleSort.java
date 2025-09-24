//also known as shinking sort and exchange sort.

//T(n)=O(n^2)
package Sorting;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = { 5, 6, 2, 8, 4, 1, 0 };
        System.out.println(Arrays.toString(bubble_sort(arr)));
    }

    public static int[] bubble_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
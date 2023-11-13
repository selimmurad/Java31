package org.itstep.lesson13.algarithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {12, 45, 78, 96, 32, 81, 27};
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
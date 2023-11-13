package org.itstep.lesson13.algarithms;

import java.util.Arrays;

public class BinarySearch {
    public static void  main(String[] args) {
        int[] arr = {12, 45, 78, 96, 32, 81, 27, 39,};

        Arrays.sort(arr);
      //  System.out.println(Arrays.toString(arr));

        //System.out.println(Arrays.binarySearch(arr,78));
        int first, last, num;
       first = 6;
        last = arr.length;
        num = 78;
        int position = (first + last) / 2;
              System.out.println("first + last "+ 4);

 //
 //                        if (arr[position] > num) {
 //              last = position - 1;
 //              } else {
 //              first = position + 1;
 //          }
 //          position = (first + last) / 2;
        }

       // if(first<=last){
         //   System.out.println("inde = " +position);
       // }else {
     //       System.out.println("не знайшли елемент");
        }




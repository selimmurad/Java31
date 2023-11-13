package org.itstep.lesson13;

import java.util.Random;

public class Tassk7 {



    public class MultiArrTask6 {
        //Завдання 7:
        // У двовимірному масиві, заповненому випадковими числами,
        // визначте мінімальний та максимальний елементи для кожного рядка.
        // Результати виведіть на екран.

        public static void main(String[] args) {
            int[][] matr = new int[5][5];
            Random random = new Random();


            for (int i = 0; i < matr.length; i++) {


                for (int j = 0; j < matr[i].length; j++) {
                    matr[i][j] = random.nextInt(10, 100);
                    System.out.print(matr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            for (int i = 0; i < matr[0].length; i++) {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < matr.length; i++) {
                    System.out.println(matr[j][i] +" " );
                    if (matr[j][i] > max){
                        max = matr[j][i];
                    }
                    if(matr[j][i] < min){
                        min = matr[j][i];

                }

            }
            System.out.println(" max = " + max +"min =" + min);



        }
        }
    }
}





package org.itstep.lesson6.hemework;
import java.util.Random;
public class Task2 {
    //Завдання 8:
    //    В одномерном массиве, заполненном случайными числами,
    //    Определяем минимальное и максимальное количество элементов,
    //    подсчитываем
    //    количество отрицательных и положительных элементов,
    //    подсчитайте количество Нуле
    //    Отобразите результаты на экране.

        public static void main(String[] args) {
            int[] array = new int[10];
            Random random = new Random();

            // Zapolnyat massivi slucaynie znacenie

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(30) + 100;
            }

            // poisk min i max element

            int min = array[0];
            int max = array[0];
            for (int value : array) {
                if (value < min) {
                    min = value;
                }
                if (value > max) {
                    max = value;
                }
            }

            // padscot otricatelnie , polojetelnie i nuley.
            int negativeCount = 0;
            int positiveCount = 0;
            int zeroCount = 0;
            for (int value : array) {
                if (value < 0) {
                    negativeCount++;
                } else if (value > 0) {
                    positiveCount++;

                    zeroCount++;
                }
            }

            System.out.println("Масив: " + java.util.Arrays.toString(array));
            System.out.println("Міn element: " + min);
            System.out.println("Маx element: " + max);
            System.out.println("otricatelnie element: " + negativeCount);
            System.out.println("polojitelnie element: " + positiveCount);
            System.out.println("kolicestvo nul: " + zeroCount);
        }
    }




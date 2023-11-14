package org.itstep.lesson6.hemework;
import java.util.Random;

public class Task3 {
    //Завдання 10
    //Заполните массив размерности n случайными цифрами от 0 до 33.
    //    Найти элемент массива, который делится на
    //    Значение элемента слева и значение элемента справа.
    //    Вывод в консоль значения исходного массива.
    //    Распечатать индекс найденного элемента .
    //    Если ничего не найдено, выведите -1 .


        public static void main(String[] args) {

            int n = 10;  // Razmer masiva mojno zamenit
            int[] array = new int[n];
            Random random = new Random();

            // Zopolnyat massiv ot 0 до 33

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(34);  // Qeneracie  ot 0 до 33
            }

            // Poysk potxadyasie elementov

            int foundIndex = -1;  //index naidennogo element, po umolchaniyu -1 (esli nichego nay naydeno)
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] % array[i - 1] == 0 && array[i] % array[i + 1] == 0) {
                    foundIndex = i;

                }
            }
            System.out.println("Massiv: " + java.util.Arrays.toString(array));
          //  System.out.println("index naydennoqo element: " + foundIndex);


        }
    }


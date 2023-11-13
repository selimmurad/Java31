package org.itstep.lesson3.homework;

import java.util.Scanner;
public class HomeWork3 {
    //Завдання 12
    //Програма запитує шестизначне число. Після введення програма
    //визначає, чи буде квиток з таким номером «щасливим» (сума
    //перших трьох цифр збігається із сумою трьох останніх цифр).
    //Приклад введених даних:
    //423027
    //954832
    //Вивід:
    //Так
    //Нi



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть шестизначне число: ");
            int number = scanner.nextInt();

            int digit1 = number / 100000 % 10;
            int digit2 = number / 10000 % 10;
            int digit3 = number / 1000 % 10;
            int digit4 = number / 100 % 10;
            int digit5 = number / 10 % 10;
            int digit6 = number % 10;


            if (digit1 + digit2 + digit3 == digit4 + digit5 + digit6) {
                System.out.println("щасливим");
            } else {
                System.out.println("Нe щасливим ");
            }

            scanner.close();
        }
    }







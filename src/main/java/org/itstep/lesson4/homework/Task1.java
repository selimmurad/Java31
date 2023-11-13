package org.itstep.lesson4.homework;

import java.util.Scanner;


public class Task1 {
    //  Користувач вводить з клавіатури деякі числа (a, b, c),
    //  вивести на екран всі числа які є одночасно кратними числам
    //  (a, b, c) з діапазону від 0 до 100000.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть число a: ");
            int a = scanner.nextInt();
            System.out.print("Введіть число b: ");
            int b = scanner.nextInt();
            System.out.print("Введіть число c: ");
            int c = scanner.nextInt();

            System.out.println("Числа кратні одночасно числам " + a + ", " + b + " та " + c + ":");

            for (int i = 0; i <= 100000; i++) {
                if (i % a == 0 && i % b == 0 && i % c == 0) {
                    System.out.println(i);
                }
            }

            scanner.close();
        }
    }





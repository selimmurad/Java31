package org.itstep.lesson8.homework;
import java.util.Scanner;
public class Task1 {
    //Завдання 2
    //Напишіть програму, яка створить рядок, в якому знаходяться всі
    //цілі числа, починаючи з 1, виписані в один рядок
    //«123456789101112131415...». Рядок має бути довжиною не
    //більше 1 000 символів.
    //За числом n (введеного з клавіатури), виведіть цифру на
    //n-й позиції (використовується нумерація з 1).
   //


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть позицію (n): ");
            int n = scanner.nextInt();

            StringBuilder sequence = new StringBuilder();

            // Додаємо цілі числа у послідовність до тих пір, поки рядок не перевищить 1000 символів
            for (int i = 1; sequence.length() < 1000; i++) {
                sequence.append(i);
            }

            // Виводимо всю послідовність чисел
            System.out.println("Послідовність цілих чисел: " + sequence);

            // Отримуємо цифру на вказаній позиції
            char digit = sequence.charAt(n - 1);
            System.out.println("Цифра на позиції " + n + ": " + digit);

            scanner.close();
        }
    }



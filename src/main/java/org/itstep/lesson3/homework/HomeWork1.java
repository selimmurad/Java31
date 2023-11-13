package org.itstep.lesson3.homework;

import java.util.Scanner;

public class HomeWork1 {
    // задание 1
    //  Напишіть програму, яка пропонує користувачу ввести з
    //  клавіатури номер дня тижня, і у відповідь показує назву цього
    // дня (наприклад, 6 — субота). Розв'яжіть завдання з
    //  використанням switch.



    public static class Main {
        public static void main(String[] args) {
            Scanner scanner;
            scanner = new Scanner(System.in);

            System.out.print("Введіть номер дня тижня:");

            int dayNumber = scanner.nextInt();
            String dayName = switch (dayNumber) {
                case 1 -> "Понеділок";
                case 2 -> "Вівторок";
                case 3 -> "Середа";
                case 4 -> "Четвер";
                case 5 -> "П'ятниця";
                case 6 -> "Субота";
                case 7 -> "Неділя";
                default -> "Некоректний номер дня";
            };

            System.out.println("Назва дня тижня: " + dayName);

            scanner.close();

        }
    }



}

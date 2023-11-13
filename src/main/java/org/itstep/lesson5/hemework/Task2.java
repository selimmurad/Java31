package org.itstep.lesson5.hemework;
import java.util.Scanner;
public class Task2 {
    //Завдання 3:
    //Користувач вводить з клавіатури довжину та ширину
    //прямокутника. Виведіть на екран незаповнений прямокутник
    //(відображаються лише межі прямокутника). Розмір довжини та
    //ширини дорівнює введеним даним


    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть довжину прямокутника: ");
            int length = scanner.nextInt();

            System.out.print("Введіть ширину прямокутника: ");
            int width = scanner.nextInt();

            // Виведення незаповненого прямокутника
            for (int i = 1; i <= length; i++) {
                for (int j = 1; j <= width; j++) {
                    if (i == 1 || i == length || j == 1 || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }
    }}

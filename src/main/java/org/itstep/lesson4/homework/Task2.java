package org.itstep.lesson4.homework;

import java.util.Scanner;

public class Task2 {
    //Напишіть програму, яка перевірятиме,
    // чи є введене число з клавіатури,
    // паліндромом (яке можна однаково прочитати в обох напрямках).
    // Наприклад, 123454321 або 221122 — паліндром.
    // Програма має вивести YES, якщо число є паліндромом,
    // і NO якщо число не паліндром.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int palindrom = sc.nextInt();
        System.out.println(palindrom);

        String palStr = String.valueOf(palindrom);

        boolean b = false;

        for (int i = 0, j = palStr.length() - 1; i < j; i++, j--) {
            if (palStr.charAt(i) == palStr.charAt(j)) {
                b = true;
            } else {
                b = false;
                break;
            }
        }


        if (b == true) {
            System.out.println("Yes , palindrom");
        }else {
            System.out.println("No , palindrom");
        }
    }
}
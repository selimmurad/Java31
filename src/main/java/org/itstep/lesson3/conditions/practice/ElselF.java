package org.itstep.lesson3.conditions.practice;

import java.util.Scanner;

public class ElselF {
    // Програма робить скидку для пенсионерев та школлярив

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введить ваш вик");
        int age = 0;
        double amount = 1000;


        if (sc.hasNextInt()) {
            age = sc.nextInt();
            if (age >= 7  && age <= 90) {
             if (age >= 7 && age <=18) {
                 amount = amount * 0.75;


                 System.out.println("(Цена тавару  = " + amount);
             }else if (age< 60 );

             }
            } else {
                System.out.println("Для вашего вику все безкоштовноуке");
            }

            System.out.println("Неверни данні , папробвайте еше");
        }
    }











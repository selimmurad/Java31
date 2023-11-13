package org.itstep.lesson2.homework;

public class HomeWork2 {
    //Завдання 7
    //Розробіть програму, яка дозволить обчислити суму вкладу банку
    //через два роки за встановленим річним відсотком, якщо задана
    //початкова величина вкладу.
    public static void main(String[] args) {
        int sum = 56000;
        int procent = 14;
        int sum1 = sum+sum/100*procent;
        System.out.println(sum1);
        int sum2 =sum1+sum1/100*procent;
        System.out.println(sum2);
    }
}

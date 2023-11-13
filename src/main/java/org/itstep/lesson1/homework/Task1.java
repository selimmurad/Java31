package org.itstep.lesson1.homework;

public class Task1 {

    //Завдання 1:

    // У змінних х та y зберігаються два натуральні числа. Створіть
    // програму, виведену в консоль:
    //  результат цілісного ділення x на y;
    //  залишок від ділення x на y;
    //  квадратний корінь з x.


    public static void main(String[] args) {

        int x = 20;
        int y = 3;
        System.out.println("x = 20,y = 3");

        int resultDivision = x / y;

        System.out.println("Rtzuitat celnoqo dilenie x na y; " + resultDivision);

        int remainder = x % y ;

        System.out.println("Ostatki ot dilenie "+ remainder);

        double squareRoot = Math.sqrt(x);

        System.out.println(" Kvadratniy koren s x ; " + squareRoot);


    }
}
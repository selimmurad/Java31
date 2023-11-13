package org.itstep.lesson15.homework;

public class Task1 {
    //Завдання 3
    //     Створіть клас Money (Гроші) для роботи з грошовими сумами.
    //     Число має бути представлене двома полями:
    //      типу long – для гривень;
    //      типу byte – для копійок.
    //     Реалізуйте виведення значення на екран,
    //     при цьому дробова частина має бути відокремлена комою від цілої частини.
    //     Реалізуйте
    //     додавання,
    //     віднімання,
    //     ділення сум,
    //     *ділення суми на дробове число,
    //     *множення на дробове число
    //     та операції порівняння.



    public class Money {


        private long hrivnia;
        private byte kopiyka;

        public Money() {
        }

        public Money(long hrivnia, byte kopiyka) {
            kopiyka = (byte) Math.absExact(kopiyka);
            hrivnia = Math.abs(hrivnia);
            if (kopiyka >= 100) {
                hrivnia++;
                kopiyka -= 100;
            }
            this.hrivnia = hrivnia;
            this.kopiyka = kopiyka;
        }


        public void show() {
            System.out.println(hrivnia + "," + kopiyka);
        }
    }
}
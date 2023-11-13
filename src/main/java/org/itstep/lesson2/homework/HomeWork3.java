package org.itstep.lesson2.homework;

public class HomeWork3 {
    //Завдання 10
    //Напишіть програму розрахунку ідеальної ваги до зросту. В
    //константах зберігаються зріст (height) і вага (weight). Виведіть в
    //консоль повідомлення про те, скільки кілограм потрібно набрати
    //або скинути (ідеальна вага = зріст - 110
    public static void main(String[] args) {
        int height = 180;
        int weight = 70;
        int ideal = height - 110;
        if(weight==ideal){
            System.out.println("vas ves idealnie");
        }
        else {
            System.out.println("vas ves ne idealnie");
        }
    }
}

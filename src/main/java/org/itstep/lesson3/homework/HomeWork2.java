package org.itstep.lesson3.homework;

public class HomeWork2 {
    //Задача 4
//Данная точка на плоскости задается координатами x и y.
//вывод на консоль, в которой четверти (в прямоугольных (декартовых)
//системы координат) является точкой. Кварталы обозначены
//римскими цифрами
    public static void main(String[] args) {
        int x = 24;
        int y = -16;
        if (x > 0 && y > 0) {
            System.out.println("I");
        }
        if (x < 0 && y > 0) {
            System.out.println("II");
        }
        if (x < 0 && y < 0) {
            System.out.println("III");
        }
        if (x > 0 && y < 0) {
            System.out.println("IV");
        }

    }}
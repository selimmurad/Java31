package org.itstep.lesson4;

public class MathExample {
    //bibloteka MATH

    public static void main(String[] args) {
        double rowRes = Math.pow(3, 3);
        System.out.println("rowRes = " + rowRes);


        int max = Math.max(10, 5);
        System.out.println("max 0" + max);

        // знайти максимум з 4х чисел
        int a, b, c, d;
        a = 10;
        b = 12;
        c = 6;
        d = 9;
        int maxFour = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("maxFOUR = " + maxFour);

        //драбовое чистина выдлетает
        //int round = (int)15.878907;
        //Библотека ест 3 мтод
        // 1.Math.ceil(); округляет верхний значение
        //2. Math .floor(); округляет нижний значение
        //3. Math.random() округляет матиматические значение
        System.out.println("Math.raunda(13.487) = " + Math.round(12.5));
        System.out.println("ceil = " + Math.ceil(12.01));
        System.out.println("floor =" + Math.floor(12.45));
        // ?
        System.out.println("random =" + Math.random());

        System.out.println(0.7 + 0.1);
        System.out.println(Math.floor(0.8 + 0.5));
        {
            System.out.println(Math.ceil(0.7 + 0.1));

            System.out.println(Math.random());



        }
    }
}
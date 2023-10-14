package org.itstep.lesson2;

public class Application {

    public static void  main(String[] args){

        //неявние перетворение byte - long
        byte b = 12;
        long l =  b;

        //явние перетворение int - short
        int i = 500000000;
        short sh = (short)  i;
        //втрата данных
        int i1 = 130;
        byte b1 = (byte) i1;
        System.out.println("b1 = "+ b1);//------- 0 ++++++++

        //константа
        final int num = 15;
        //не можна заменит
        // num = 20




    }
}

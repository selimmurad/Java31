package org.itstep.lesson1;

public class Types {
    public static void main(String[]args){
        // ===примитивни типи даних ===

        // === числови типи ===
        //  цилий цисла


        byte b = 127; //-128 do 127 2^8 -2^7 do 2^/ -1
        short sh = 20; // 2^16 -2^15 -1
        int in = 99999; //2^32 -2^31 do 2^32 -1
        long l = 9999999L; // 2^64
        // дробови числа
        float fl = 15.5F; // (4 byte)
        double d =15.5 ;//(8 byte)

        //symbols
        char ch ='A';//(2 byte)
        //logic
        boolean boll = true;//(1 byte)

        // осоливист типов  double(float)
        System.out.println(d/0);//Infinity
        System.out.println(-d/0);//Infinity
        System.out.println(0.0/0.0);//Not anumber

        //=== Силочни типи даних==

        String name = "Jack";

        //Класи обгортки для примитивов
        Byte.parseByte("15");
        Short.valueOf("45");
        Integer.toString(15);
        Double.hashCode(15.5);
        Character.isDigit('9');
        Boolean.getBoolean("hello");
         }


}



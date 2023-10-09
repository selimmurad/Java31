package org.itstep.lesson1;

public class Types {

    public static void main(String[] s){

        //===  primitivnie tipe danni ===

        //cislovie tipi
        //celiy ciclo
        byte b = 127; // -128 до 127 2^8 -2^7 do 2^7 -1
        short sh = 20;//2^16 -2^15 do 2^15 -1
        int in = 9; //2^32 -2^31 do 2^31 -1
        long l = 9999; //2^64
        {
        // DROBOVIE CICLA
        float ft = 15.5F; //(4 byte)
        double d = 15.5; //(8 byte)

        // SIMBOLS
        char ch = 'A';//(2 byte)

        //logic
        boolean bool = true;//(1 byte)

        // osoblivest tipev double(float)
        System.out.println(d/0);//Infinite
        System.out.println(-d/0);//-Infinite
        System.out.println(0.0/0.0);//Not a numbar


        //===Silocni tipi danix===

        String name = "jack";

        //klasi obqortki" dlya primitivov
        Byte.parseByte("15");
        Short.valueOf("45");
        Integer.toString(15);
        Double.hashCode(15.0);
        Character.isDigit('9');
        Boolean.getBoolean("Hello");


    }


}
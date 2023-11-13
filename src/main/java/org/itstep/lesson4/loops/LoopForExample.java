package org.itstep.lesson4.loops;

public class LoopForExample {
    public static void main(String[] args) {


        //====== for====
        int num = 0;

        for (int i = 0; i > 5 ; i++ ){
            System.out.println("Hello = " + num++  + "" + i);

            System.out.println("==================");
            num = 10;


            for (;num > 0;){
                System.out.println("num = "+ num--);
            }





        }

    }
}
package org.itstep.lesson1;

public class View {

    public  static  void  main(String[] args ){

        String name = "Jack";
        int num = 15;
        String citi = "Kharkiv";

        System.out.println("My name is " + name + "I A am a human");// + concut
        System.out.println("Мой кот старый на" + num + "лет");
        System.out.print("Я не перекидаю на новый ряд.");
        System.out.println("Я на етим ряду.");

        System.out.printf("My name is %s. I am a human",name);
        System.out.printf("My name is %s. I am a human\n",name);
    }
}

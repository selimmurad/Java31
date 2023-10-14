package org.itstep.lesson3.conditions;

public class ApplicationlfElse {

    public static void main(String[] args) {

        // if(умова){
        // тело оператора
        //}

        final int condition = 10;
        int x = 10;

        if (x <= condition) {
            System.out.println(x + " менший обо доривнюе за " + condition);


            // if(умова){
            // тело оператора
            //}else
            // тело оператора elsa
            if (x == condition) {
                System.out.println(" == ");
            } else {
                System.out.println(" Умова if не вионана");
            }
            System.out.println("Hello");
            System.out.println("<>");

            // if(умова){
            // тело оператора if
            //}else if(умова)
            //тело оператора tlse if
            //}else if(умова)
            //
            //}else if(умова)else if
            if (x > condition) {
                System.out.println(">");
            } else if(x < condition) {
                System.out.println("<");
            } else  {
                System.out.println(" == ");

                }
            }}

            }





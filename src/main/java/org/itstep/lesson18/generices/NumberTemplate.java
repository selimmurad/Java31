package org.itstep.lesson18.generices;

public class NumberTemplate <T extends Number>{


    T value;

    public NumberTemplate(T value) {
        this.value = value;
    }

    public void method(){

        System.out.println(value);
    }
}


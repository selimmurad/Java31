package org.itstep.lesson18.generices;

public class Main {
    public static void main(String[] args) {
        Template<Integer> temp = new Template<>(15);
        temp.show();

        Template<String> tempStr = new Template<>("Jack");
        tempStr.show();


        NumberTemplate<Number> numberTemplate = new NumberTemplate<>(12.6F);
    }
}


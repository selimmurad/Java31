package org.itstep.lesson4.practice;

public class WhileExample {
    public static void main(String[] args) {

        char ch = 'A'; // ASCII 65

        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }

        System.out.println("\n================");

        for (ch = 'a'; ch < 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}

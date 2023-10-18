package org.itstep.lesson4;

public class TernarExample {

    public static void main(String[] args) {

       String res =  10 > 15 ?" > ":"<=";
       System.out.println("res = " + res);
       System.out.println(54 > 98 ?"ok": "Error");
       String res1 = 27 != 14 ? "ok" : 24 > 14 ? "ok " : "Err";
       System.out.println("res1 = " + res1);
    }
}

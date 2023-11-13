package org.itstep.lesson19;

public class Book<T> {

    String name;
    int pages;
    public void method(App<? super Integer>app){
        System.out.println(app.value);
    }

    public void method () {
 //       System.out.println(app.value);
    }
}
class App<T>{
    T value;
 //   public App<T> {

    }

class Main{
    public static void main(String[] args) {
        App<Integer>integerApp = new App<>();
    }
}
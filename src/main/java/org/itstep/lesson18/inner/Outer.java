package org.itstep.lesson18.inner;


public class Outer {

    private String outName;

    class Inner {
        public void show() {
            System.out.println(outName);
        }

      //  class Inner {
            String outName;//затенение

            public void showName() {
                System.out.println(outName);
            }
        }

    }




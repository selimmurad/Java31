package org.itstep.lesson22.exceptions;

import java.rmi.NoSuchObjectException;
import java.util.NoSuchElementException;

public class App5 {
    public static void main(String[] args) {

        try {
            throw new ArithmeticException("Moya viklyucna stuaciya");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            try {

           //     throw new NoSuchObjectException("") {

           //     }


                }catch (NoSuchElementException ex){
            System.out.println();
            System.out.println("vunutrinnie perexoplenie");
            }
        }
        {
        }
    }
    }


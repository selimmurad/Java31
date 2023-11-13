package org.itstep.lesson22.exceptions;

import static java.lang.System.*;

public class App4 {
    public static int method() {
        out.println();
        try {
            return 0;
        }finally {
            out.println("end");
        }
    }
    public static int method1(int arg){
        if(arg % 2 == 0){
            return arg * arg;
        }
        return 0;
    }
}

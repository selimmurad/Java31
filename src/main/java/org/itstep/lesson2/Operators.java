package org.itstep.lesson2;

public class Operators {

    public static void  main(String[] args) {


        //Arithmetic
        int first = 17;
        int second = 3;

        System.out.println((double) first / second);
        System.out.println(first % second);

        System.out.println("increment");
        int cont = 9;
        System.out.println("count = " + cont);
        System.out.println( "count = "+ cont++);//postfix
        System.out.println( "count = "+ cont);
        System.out.println( "cout = "+ ++cont);//prefix

        System.out.println("decrement");

        System.out.println("count = " + cont);
        System.out.println( "count = "+ cont--);//postfix
        System.out.println( "count = "+ cont);
        System.out.println( "count = "+ --cont);//prefix


        //Операцие поровняння

        System.out.println(">" + (first > second));
        System.out.println("<" + (first < second));
        System.out.println(">=" + (first >= second));
        System.out.println("<=" + (first <=second));
        System.out.println("==" + (first == second));
        System.out.println("!=" + (first != second));

        System.out.println("логичние операатры");
        boolean res1 = 3 <= (2+30) % 7 && 5 >= 10/2;

        System.out.println("res1 =  " +res1);

        boolean res2 = true || false && true;

        System.out.println("res2 = "+ res2);

        //Oператор  += *=  /= -=
        //Заболшит число на 10

        //варирт1
        // int num = 32;
//     final int ten = 10;
//   int result = num + ten;
//    num = result;

       //варирт2
      //  int num = 32;
   //   final int ten = 10;
        //   num = num + ten;

        //варирт3
    //    int num = 32;
      //  final int ten = 10;
        //num += num ;//num = num + ten;

        //варирт4
        int num = 32;
        final int ten = 10;
        num /= num ;//num = num + ten;


        System.out.println("num = "+ num);
}

}



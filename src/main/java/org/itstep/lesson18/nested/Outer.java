
package org.itstep.Lesson18.nested;
  public class Outer {
      String outName;

      static class Nested {
          public void showName(){
              //System.out.println(outName);
              System.out.println("Nested name");
          }

      }
}

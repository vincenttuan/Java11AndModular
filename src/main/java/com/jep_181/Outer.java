package jep_181;

import java.lang.reflect.Method;

public class Outer {
    public static class InnerA {
        public void printName() throws Exception {
            InnerB innerB = new InnerB();
            Method m = innerB.getClass().getDeclaredMethod("printName");
            m.invoke(innerB);
            innerB.printName();
        }
    }
    
    public static class InnerB {
        // 注意：private
        private void printName() throws Exception {
            System.out.println("Hello JEP 181");
        }
    }
    
    public static void main(String[] args) throws Exception {
        InnerA innerA = new InnerA();
        innerA.printName();
    }
    
}

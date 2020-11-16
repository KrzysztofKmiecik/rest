package designPattern.Singleton;

import sun.tools.tree.AssignShiftLeftExpression;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1=Singleton.getInstance();
        System.out.println(singleton);

    }
}

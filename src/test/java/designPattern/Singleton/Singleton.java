package designPattern.Singleton;

public class Singleton {

    private static Singleton sigleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (sigleton == null) {
            sigleton = new Singleton();
        }
        return sigleton;
    }

}

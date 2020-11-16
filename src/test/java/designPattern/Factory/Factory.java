package designPattern.Factory;

public class Factory {

    public static Computer build(String computerToBuild) {

        if (computerToBuild.equals("Laptop")) {
            return new Laptop();
        } else if (computerToBuild.equals("Desktop")) {
            return new Desktop();
        } else {
            return null;
        }

    }
}

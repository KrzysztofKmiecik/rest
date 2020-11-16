package designPattern.Factory;

public class Main {
    public static void main(String[] args) {
        Computer computer = Factory.build("Desktop");
        System.out.println(computer.name());

    }
}

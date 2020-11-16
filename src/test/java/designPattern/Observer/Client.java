package designPattern.Observer;

public class Client implements MyObserver  {

    private String name;

    public Client(String name){
        this.name=name;
    }

    @Override
    public void subscribe() {
        System.out.println(name + " info for you -> DONE");
    }
}

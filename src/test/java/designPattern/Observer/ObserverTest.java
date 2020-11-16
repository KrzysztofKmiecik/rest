package designPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverTest {
    public static void main(String[] args) {

        List<Client> clients=new ArrayList<>();

        clients.add(new Client("John"));
        clients.add(new Client("Ola"));
        clients.add(new Client("Beatka"));
        Subject subject=new Subject(clients);


    }
}

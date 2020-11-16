package designPattern.Observer;

import java.util.List;

public class Subject {

    public Subject(List<Client> clients){
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (Client client : clients){
                    client.subscribe();
                }

            }
        });

        thread.start();

    }


}

package immutable;

public final class Person {
    private int id;
    private String name;
    private Adress adress;

    public Person(int id,String name, Adress adress){
        this.id=id;
        this.name=name;
        Adress adress1 =new Adress();
        adress1.setStreetNumber(adress.getStreetNumber());
        this.adress=adress1;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }
}

package immutable;

public class Adress {
    private int streetNumber;
    public void setStreetNumber (int streetNumber){
        this.streetNumber=streetNumber;

    }
    public int getStreetNumber(){
        return this.streetNumber;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "streetNumber=" + streetNumber +
                '}';
    }
}

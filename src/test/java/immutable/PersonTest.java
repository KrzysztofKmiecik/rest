package immutable;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void shouldget() {
        Adress adress = new Adress();
        adress.setStreetNumber(1);
        Person person = new Person(1, "John", adress);

        System.out.println(person.toString());

        adress.setStreetNumber(2);
        System.out.println(person.toString());
    }

}

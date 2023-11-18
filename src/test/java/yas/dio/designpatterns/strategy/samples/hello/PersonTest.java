package yas.dio.designpatterns.strategy.samples.hello;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

    private Person person;

    @BeforeEach
    public void setUp() {
        person = new Person();
    }

    @Test
    void given_person_talking_to_unknown() {
        person.setSayHello(new HelloStrategy());
        person.sayHello();
    }

    @Test
    void given_person_talking_to_friend() {
        person.setSayHello(new HiStrategy());
        person.sayHello();
    }

    @Test
    void given_person_saying_hello_on_the_morning() {
        person.setSayHello(new GoodMorningStrategy());
        person.sayHello();
    }

    @Test
    void given_person_saying_hello_on_the_afternoon() {
        person.setSayHello(new GoodAfternoonStrategy());
        person.sayHello();
    }

    @Test
    void given_person_saying_hello_for_professional() {
        person.setSayHello(() -> "Good morning, sir");
        person.sayHello();
    }
}
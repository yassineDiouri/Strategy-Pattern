package yas.dio.designpatterns.strategy.samples.hello;


public class Person {

    SayHelloStrategy sayHello;

    public void setSayHello(SayHelloStrategy sayHello) {
        this.sayHello = sayHello;
    }

    public void sayHello() {
        System.out.println(this.sayHello.execute());
    }
}

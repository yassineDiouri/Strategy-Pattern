package yas.dio.designpatterns.strategy.samples.hello;

public class HelloStrategy implements SayHelloStrategy {
    @Override
    public String execute() {
        return "Hello!";
    }
}

package yas.dio.designpatterns.strategy.samples.hello;

public class HiStrategy implements SayHelloStrategy {
    @Override
    public String execute() {
        return "Hi there!";
    }
}

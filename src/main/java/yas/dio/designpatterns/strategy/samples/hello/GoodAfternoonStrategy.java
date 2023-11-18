package yas.dio.designpatterns.strategy.samples.hello;

public class GoodAfternoonStrategy implements SayHelloStrategy {
    @Override
    public String execute() {
        return "Good afternoon";
    }
}

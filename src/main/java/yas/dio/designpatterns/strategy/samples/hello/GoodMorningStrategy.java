package yas.dio.designpatterns.strategy.samples.hello;

public class GoodMorningStrategy implements SayHelloStrategy {
    @Override
    public String execute() {
        return "Good morning";
    }
}

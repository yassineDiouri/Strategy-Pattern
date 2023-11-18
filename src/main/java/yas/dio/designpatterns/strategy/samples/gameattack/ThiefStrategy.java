package yas.dio.designpatterns.strategy.samples.gameattack;

public class ThiefStrategy implements AttackStrategy {

    @Override
    public String execute() {
        return "Quick attack using Daggers";
    }
}

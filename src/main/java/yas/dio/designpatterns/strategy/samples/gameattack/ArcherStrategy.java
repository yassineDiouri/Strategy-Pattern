package yas.dio.designpatterns.strategy.samples.gameattack;

public class ArcherStrategy implements AttackStrategy {

    @Override
    public String execute() {
        return "Distance attack using Bow";
    }
}

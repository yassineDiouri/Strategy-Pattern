package yas.dio.designpatterns.strategy.samples.gameattack;

public class WarriorStrategy implements AttackStrategy {

    @Override
    public String execute() {
        return "Hand-to-hand attack using Sword";
    }
}

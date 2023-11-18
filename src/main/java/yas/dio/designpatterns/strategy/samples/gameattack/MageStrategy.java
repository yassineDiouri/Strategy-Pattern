package yas.dio.designpatterns.strategy.samples.gameattack;

public class MageStrategy implements AttackStrategy {

    @Override
    public String execute() {
        return "Mid-distance attack using Magic";
    }
}

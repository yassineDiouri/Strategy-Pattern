package yas.dio.designpatterns.strategy.samples.gameattack;


public class Character {

    private AttackStrategy attackStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        System.out.println(this.attackStrategy.execute());
    }
}

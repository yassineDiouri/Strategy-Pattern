package yas.dio.designpatterns.strategy.samples.gameattack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharacterTest {

    private Character character;

    @BeforeEach
    void setUp() {
        character = new Character();
    }

    @Test
    public void given_archer_should_attack_from_distance() {
        character.setAttackStrategy(new ArcherStrategy());
        character.attack();
    }

    @Test
    public void given_warrior_should_attack_using_sword() {
        character.setAttackStrategy(new WarriorStrategy());
        character.attack();
    }

    @Test
    public void given_thief_should_do_quick_attack() {
        character.setAttackStrategy(new ThiefStrategy());
        character.attack();
    }

    @Test
    public void given_mage_should_do_magic_attack() {
        character.setAttackStrategy(new MageStrategy());
        character.attack();
    }
}
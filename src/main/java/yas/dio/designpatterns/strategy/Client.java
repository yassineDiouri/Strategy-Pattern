package yas.dio.designpatterns.strategy;

public class Client {

    private Strategy strategy;

    public Client usingStrategy(String strategy) {
        this.strategy = loadStrategy(strategy);
        return this;
    }

    public void execute() {
        this.strategy.execute();
    }

    private Strategy loadStrategy(String strategy) {
        return switch (strategy) {
            case "impl1" -> new StrategyImpl1();
            case "impl2" -> new StrategyImpl2();
            case "impl3" -> new StrategyImpl3();
            default -> throw new IllegalArgumentException("There is no defined strategy for : " + strategy);
        };
    }
}

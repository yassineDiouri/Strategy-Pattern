package yas.dio.designpatterns.strategy;

public class Context {

    private Strategy strategy;

    public Context setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public void execute() {
        this.strategy.execute();
    }

}

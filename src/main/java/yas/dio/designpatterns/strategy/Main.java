package yas.dio.designpatterns.strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        while (true) {
            try {
                Strategy concreteStrategy = getConcreteStrategy();
                context
                        .setStrategy(concreteStrategy)
                        .execute();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Strategy getConcreteStrategy() {
        Scanner scanner = new Scanner(System.in);
        String strategy = scanner.next();

        return switch (strategy) {
            case "impl1" -> new StrategyImpl1();
            case "impl2" -> new StrategyImpl2();
            case "impl3" -> new StrategyImpl3();
            default -> throw new IllegalArgumentException("There is no defined strategy for : " + strategy);
        };
    }
}

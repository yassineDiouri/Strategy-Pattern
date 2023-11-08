package yas.dio.designpatterns.strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String strategy = scanner.next();
                context.usingStrategy(strategy).execute();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
